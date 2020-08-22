package app;
/*
1 - Clubs
2 - Hearts
3 - Spades
4 - Diamonds
*/

/*
Subtitle
9  - Royal Straight Flush   = done
8  - Straight Flush         = done
7  - Four of a King         = done
6  - Full House             = done
5  - Flush                  = done
4  - Straight               = done
3  - Three of a Kind        = done
2  - Two Pair               = done
1  - One Pair               = done
0  - High Card              = done
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //value that cards can take
    public static String[] valueCards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
    //values of suits
    public static String[] valueSuitS = new String[]{"♣","♥","♠","♦"};
    //ranking hands games for texas holdem
    static String[] typesOfGames = {"Carta Alta","Um Par","Dois Pares","Trinca","Sequencia",
            "Flush","Full House","Quadra","Straight Flush","Royal Straight Flush"};

    public static int whoWins(GameCards player1, GameCards player2){
        System.out.println("A");
        FunctionRankingHand.rankingHand(player1);
        System.out.println("B");
        FunctionRankingHand.rankingHand(player2);
        System.out.println("C");
        if (player1.rankingGame>player2.rankingGame){//if player one have more ranking to the second player
            System.out.println("D");
            return 1;
        }else if (player2.rankingGame>player1.rankingGame){//if player two have more ranking to the first player
            System.out.println("E");
            return 2;
        }else {//if they have the same ranking level needs tiebreak
            System.out.println("F");
            FunctionGetBestCards.getBestCards(player1);//get the 5 best cards
            System.out.println("G");
            FunctionGetBestCards.getBestCards(player2);//get the 5 best cards
            System.out.println("H");
            for (int i=0; i<=4;i++){//compare
                if (player1.bestCards[i].value>player2.bestCards[i].value){
                    System.out.println("I");
                    return 1;
                }else if (player1.bestCards[i].value<player2.bestCards[i].value){
                    System.out.println("J");
                    return 2;
                }
            }
        }
        System.out.println("K");
        return 0;
    }

    public static float probability(GameCards player1 ){
        long win = 0;
        long lose = 0;
        long tie = 0;
        long error = 0;

        long count = 0 ;

        Card[] deck =
                {
                    new Card(1,1), new Card(2,1), new Card(3,1),
                    new Card(4,1), new Card(5,1), new Card(6,1),
                    new Card(7,1), new Card(8,1), new Card(9,1),
                    new Card(10,1), new Card(11,1), new Card(12,1),
                    new Card(13,1), new Card(1,2), new Card(2,2),
                    new Card(3,2), new Card(4,2), new Card(5,2),
                    new Card(6,2), new Card(7,2), new Card(8,2),
                    new Card(9,2), new Card(10,2), new Card(11,2),
                    new Card(12,2), new Card(13,2), new Card(1,3),
                    new Card(2,3), new Card(3,3), new Card(4,3),
                    new Card(5,3), new Card(6,3), new Card(7,3),
                    new Card(8,3), new Card(9,3), new Card(10,3),
                    new Card(11,3), new Card(12,3), new Card(13,3),
                    new Card(1,4), new Card(2,4), new Card(3,4),
                    new Card(4,4), new Card(5,4), new Card(6,4),
                    new Card(7,4), new Card(8,4), new Card(9,4),
                    new Card(10,4), new Card(11,4), new Card(12,4),
                    new Card(13,4)
                };

        ArrayList<Card> player1Cards = new ArrayList<>(Arrays.asList(player1.cards));
        GameCards player2;

        // a,b      ---     cards from the second player's hand
        // x,y,z    ---     floop
        // t        ---     turn
        // r        ---     river

        // NAME     |              PROBABILITY                          | time milliseconds
        // a        = 50                        = 50                    =0
        // b        = 50x49                     = 2.450                 =0
        // x        = 50x49x48                  = 117.600               =32
        // y        = 50x49x488x47              = 5.527.200             =219
        // z        = 50x49x48x47x46            = 254.251.200           =5787
        // t        = 50x49x48x47x46x45         = 11.441.304.000        =238662
        // r        = 50x49x48x47x46x45x44      = 503.417.376.000       =13113309
        //6-26-41
        long startTime = System.currentTimeMillis();
        for (Card a : deck){//a

            if (!player1Cards.contains(a)){//check if is not a repeated card

                for (Card b : deck){//b

                    if (!player1Cards.contains(b) && !b.equals(a)){//check if is not a repeated card
                        player2 = new GameCards(a,b);
                        for (Card x : deck){//x

                            if (!player1Cards.contains(x) && !x.equals(a) && !x.equals(b)){

                                for (Card y : deck){//y

                                    if (!player1Cards.contains(y) && !y.equals(a) && !y.equals(b) && !y.equals(x)){

                                        for (Card z : deck){//z

                                            if (!player1Cards.contains(z) && !z.equals(a) && !z.equals(b) &&
                                                    !z.equals(x) && !z.equals(y)){

                                                for (Card t : deck){//t

                                                    if (!player1Cards.contains(t) && !t.equals(a) && !t.equals(b) &&
                                                            !t.equals(x) && !t.equals(y) && !t.equals(z)){
//
                                                        for (Card r : deck){//r

                                                            if (!player1Cards.contains(r) && !r.equals(a) &&
                                                                    !r.equals(b) && !r.equals(x) && !r.equals(y) &&
                                                                    !r.equals(z) && !r.equals(t)){

                                                                player1.put(x,y,z,r,t);
                                                                player2.put(x,y,z,r,t);
                                                                int result=-1;
                                                                try{
                                                                    result = whoWins(player1,player2);
                                                                }catch (ArrayIndexOutOfBoundsException |
                                                                        NullPointerException exception){
                                                                    System.out.println(exception);
                                                                    System.out.println("Player1 ="+player1.rankingGame);
                                                                    System.out.println("Player2 ="+player2.rankingGame);
                                                                    System.out.println("A="+a+" | B="+b+" | X="+x+
                                                                            " | Y="+y+" | Z="+z+" | T="+t+" | R="+r);
                                                                    return 0.0f;
                                                                }


                                                                if (result==1){
                                                                    win++;
                                                                }else if (result==2){
                                                                    lose++;
                                                                }else if (result==0){
                                                                    tie++;
                                                                }else{
                                                                    error++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime)+ " milliseconds");
        System.out.println("WIN = "+win);
        System.out.println("LOSE = "+lose);
        System.out.println("TIE = "+tie);
        System.out.println("ERROR = "+error);

        long soma = win+lose+tie+error;
        System.out.println("\n\nSOMATORIO = "+soma);
        return 0.0f;
    }

    public static void main(String[] args) {

//        Card firstCard = Card.getCard();
//        Card secondCard = Card.getCard();

        Card firstCard = new Card(1,1);
        Card secondCard = new Card(1,2);
        GameCards gameCards = new GameCards(firstCard,secondCard);

        probability(gameCards);
    }
}
