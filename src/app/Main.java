package app;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //value that cards can take
    public static String[] valueCards = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K"};
    //values of suits
    public static String[] valueSuitS = new String[]{"♣","♥","♠","♦"};
    //ranking hands games for texas holdem
    public static String[] typesOfGames = {"Carta Alta","Um Par","Dois Pares","Trinca","Sequencia",
            "Flush","Full House","Quadra","Straight Flush","Royal Straight Flush"};

    public static  ArrayList<Card> deck = new ArrayList<>();

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

    public static int whoWins(GameCards player1, GameCards player2){
        FunctionRankingHand.rankingHand(player1);
        FunctionRankingHand.rankingHand(player2);

        if (player1.rankingGame>player2.rankingGame){//if player one have more ranking to the second player
            return 1;
        }else if (player2.rankingGame>player1.rankingGame){//if player two have more ranking to the first player
            return 2;
        }else {//if they have the same ranking level needs tiebreak

            FunctionGetBestCards.getBestCards(player1);//get the 5 best cards

            FunctionGetBestCards.getBestCards(player2);//get the 5 best cards

            for (int i=0; i<=4;i++){//compare
                if (player1.bestCards[i].value>player2.bestCards[i].value){

                    return 1;
                }else if (player1.bestCards[i].value<player2.bestCards[i].value){

                    return 2;
                }
            }
        }
        return 0;
    }

    public static void createDeck(){
        deck = new ArrayList<>();
        for (int value=1, suit=1 ; value<=13 && suit<=4; value++){//create a deck array list
            deck.add(new Card(value,suit));
            if (value==13){
                if (suit==4){
                    break;
                }
                suit++;
                value=0;
            }
        }
    }

    public static long[] tableCards(GameCards player1, GameCards player2){
        long win = 0,lose = 0,tie = 0,error = 0;
        int result;

        //removes the cards that have already gone
        deck.remove(player1.cards[0]);
        deck.remove(player1.cards[1]);
        deck.remove(player2.cards[0]);
        deck.remove(player2.cards[1]);

        //  1 712 304
        for (int x=0; x<deck.size();x++){

            for (int y=x+1; y<deck.size();y++){

                for (int z=y+1; z<deck.size(); z++){

                    for (int t=z+1; t<deck.size(); t++){

                        for (int r=t+1; r<deck.size(); r++){

                            player1.put(deck.get(x),deck.get(y),deck.get(z),deck.get(t),deck.get(r));
                            player2.put(deck.get(x),deck.get(y),deck.get(z),deck.get(t),deck.get(r));

                            result = whoWins(player1, player2);

                            switch (result){
                                case 0:
                                    tie++;
                                    break;
                                case 1:
                                    win++;
                                    break;
                                case 2:
                                    lose++;
                                    break;
                                default:
                                    error++;
                                    break;
                            }
                        }
                    }
                }
            }
        }
        createDeck();

        return new long[]{win,lose,tie,error};
    }

    public static void probability(){
        long win, lose,tie,error;
        GameCards player1;
        GameCards player2;
        long[] resp;

        createDeck();
        // 'a' e 'b'  = cards of a player 1
        // 'c' e 'd'  = cards of a player 2
        long startTime = System.currentTimeMillis();

        //1.624.350
        for (int a=0; a<deck.size();a++){

            for (int b=a+1; b<deck.size();b++){

                win = 0;
                lose = 0;
                tie = 0;
                error = 0;

                for (int c=0; c<deck.size(); c++){

                    if (!deck.get(c).equals(deck.get(a)) && !deck.get(c).equals(deck.get(b))){

                        for (int d=c+1; d<deck.size(); d++){

                            if (!deck.get(d).equals(deck.get(a)) && !deck.get(d).equals(deck.get(b))){

                                player1 = new GameCards(deck.get(a),deck.get(b));
                                player2 = new GameCards(deck.get(c),deck.get(d));

                                resp = tableCards(player1,player2);

                                win += resp[0];
                                lose += resp[1];
                                tie += resp[2];
                                error += resp[3];
                            }
                        }
                    }
                }
                double soma = (double) win+lose+tie+error;
                String porcentWIN = String.format("%.2f",  (((double)(100*win))/(soma)));
                String porcentLOSE = String.format("%.2f",  (((double)(100*lose))/(soma)));
                String porcentTIE = String.format("%.2f",  (((double)(100*tie))/(soma)));
                String porcentERROR = String.format("%.2f",  (((double)(100*error))/(soma)));

                long endTime = System.currentTimeMillis();
                System.out.println(deck.get(a).toString()+" | "+deck.get(b).toString()+
                        " = WIN:"+win+"-"+porcentWIN+"% | LOSE:"+lose+"-"+porcentLOSE+
                        "% | TIE:"+tie+"-"+porcentTIE+"% | ERROR:"+error+"-"+porcentERROR+"%");
                System.out.println("That took " + (endTime - startTime)+ " milliseconds\n");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Everything took " + (endTime - startTime)+ " milliseconds");
    }

    public static float arrnajoSimples(GameCards player1){
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

        //11h27min38s == souza
        //14h40min28s == rafa
        //15h22min56s == danilo
        //6-26-41
        long startTime = System.currentTimeMillis();

        for (Card a : deck) {//a

            if (!player1Cards.contains(a)) {//check if is not a repeated card
                long start = System.currentTimeMillis();
                for (Card b : deck) {//b

                    if (!player1Cards.contains(b) && !b.equals(a)) {//check if is not a repeated card
                        player2 = new GameCards(a, b);
                        for (Card x : deck) {//x

                            if (!player1Cards.contains(x) && !x.equals(a) && !x.equals(b)) {

                                for (Card y : deck) {//y

                                    if (!player1Cards.contains(y) && !y.equals(a) && !y.equals(b) && !y.equals(x)) {

                                        for (Card z : deck) {//z

                                            if (!player1Cards.contains(z) && !z.equals(a) && !z.equals(b) &&
                                                    !z.equals(x) && !z.equals(y)) {

                                                for (Card t : deck) {//t

                                                    if (!player1Cards.contains(t) && !t.equals(a) && !t.equals(b) &&
                                                            !t.equals(x) && !t.equals(y) && !t.equals(z)) {
//
                                                        for (Card r : deck) {//r

                                                            if (!player1Cards.contains(r) && !r.equals(a) &&
                                                                    !r.equals(b) && !r.equals(x) && !r.equals(y) &&
                                                                    !r.equals(z) && !r.equals(t)) {

                                                                player1.put(x, y, z, r, t);
                                                                player2.put(x, y, z, r, t);
                                                                int result = -1;
                                                                try {
                                                                    result = whoWins(player1, player2);
                                                                } catch (ArrayIndexOutOfBoundsException |
                                                                        NullPointerException exception) {
                                                                    System.out.println(exception);
                                                                    System.out.println("Player1 =" + player1.rankingGame);
                                                                    System.out.println("Player2 =" + player2.rankingGame);
                                                                    System.out.println("A=" + a + " | B=" + b + " | X=" + x +
                                                                            " | Y=" + y + " | Z=" + z + " | T=" + t + " | R=" + r);
                                                                }


                                                                if (result == 1) {
                                                                    win++;
                                                                } else if (result == 2) {
                                                                    lose++;
                                                                } else if (result == 0) {
                                                                    tie++;
                                                                } else {
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
                long end = System.currentTimeMillis();
                System.out.println("CYCLE = " + (end - start) + " milliseconds");
            }
        }
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

//        GameCards player2 = new GameCards(new Card(1,1),new Card(1,2));
//        GameCards player1 = new GameCards(new Card(1,3),new Card(1,4));

//        createDeck();
//        long[] teste = tableCards(player1,player2);
//        long soma = teste[0]+teste[1]+teste[2]+teste[3];
//        System.out.println("SOMA:"+ soma );
        probability();
    }
}
