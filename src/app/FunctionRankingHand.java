package app;

public class FunctionRankingHand {
    public static void bubblesort(GameCards gameCards){
        for (int i=0; i<=6;i++){
            for (int j=0;j<=6-i-1;j++){
                if (gameCards.cards[j].value>gameCards.cards[j+1].value){
                    Card aux = gameCards.cards[j];
                    gameCards.cards[j]=gameCards.cards[j+1];
                    gameCards.cards[j+1]=aux;
                }
            }
        }
    }

    public static boolean isRoyalStraightFlush(GameCards cards, int suitOfFlush){

        bubblesort(cards);

        if (cards.cards[0].value!=1){//the first card must be an A
            return  false;
        }

        boolean[] havecards = new boolean[13];

        for (Card card : cards.cards){
            if (card.suit==suitOfFlush){
                havecards[(card.value-1)]=true;
            }
        }

        return havecards[9] && havecards[10] && havecards[11] && havecards[12] && havecards[0];
    }

    public static boolean isStraightFlush(GameCards cards, int suitOfFlush){

        boolean[] havecards = new boolean[13];
        cards.level=1;
        for (Card card : cards.cards){
            if (card.suit==suitOfFlush){
                havecards[(card.value-1)]=true;
            }
        }
        for (int index=0; index<=9;index++){
            if (index==9){
                if (havecards[index] && havecards[index+1] &&
                        havecards[index+2] && havecards[index+3] && havecards[0]){
                    return true;
                }
            }else {
                if (havecards[index] && havecards[index+1] &&
                        havecards[index+2] && havecards[index+3] && havecards[index+4]){
                    return true;
                }
            }
            cards.level++;
        }
        return false;
    }

    public static boolean isStraight(GameCards cards){

        boolean[] havecards = new boolean[13];
        cards.level=1;

        for (Card card : cards.cards){
            havecards[(card.value-1)]=true;
        }

        for (int index=0; index<=9;index++){
            if (index==9){
                if (havecards[index] && havecards[index+1] &&
                        havecards[index+2] && havecards[index+3] && havecards[0]){
                    return true;
                }
            }

            if (havecards[index] && havecards[index+1] &&
                    havecards[index+2] && havecards[index+3] && havecards[index+4]){
                return true;
            }
            cards.level++;
        }

        return false;
    }

    public static int isFlush(GameCards cards){
        //returns:
        //0-if is not a flush
        //1-flush of Clubs
        //2-flush of Hearts
        //3-flush of Spades
        //4-flush of Diamonds

        int countOfSpades=0,countOfHearts=0,countOfDiamonds=0,countOfClubs=0;

        for (Card card : cards.cards){//counts the amount of cards of a suit
            switch (card.suit){
                case 1:
                    countOfClubs++;
                    break;
                case 2:
                    countOfHearts++;
                    break;
                case 3:
                    countOfSpades++;
                    break;
                case 4:
                    countOfDiamonds++;
                    break;
            }
        }

        //return 0 if it is not a flush
        if (!(countOfClubs>=5 || countOfHearts>=5 || countOfSpades>=5 || countOfDiamonds>=5)){
            return 0;
        }

        if (countOfClubs>=5){
            return 1;
        }else if (countOfHearts>=5){
            return 2;
        }else if (countOfSpades>=5){
            return 3;
        }else{
            return 4;
        }
    }

    public static int haveRepeatedCard(GameCards cards) {
        //count repeated values
        //5 - Four of a King
        //4 - Full House
        //3 - Three of a Kind
        //2 - Two Pair
        //1 - One Pair
        //0 - High Card/Straight/Flush/Straight Flush/Royal Straight Flush

        int[] countValueCards = new int[13];
        int have = 0;

        for (int index=0; index<=6;index++){
            countValueCards[cards.cards[index].value-1]++;
        }

        for(int count: countValueCards){
            switch (count){
                case 2:
                    have+=2;
                    break;
                case 3:
                    have+=3;
                    break;
                case 4:
                    return 5;// Four of a King
            }
        }

        switch (have){
            case 2:
                return 1;//One Pair
            case 3:
                return 3;//Three of a Kind
            case 4:
                return 2;//Two Pair
            case 6:
                for(int count: countValueCards){
                    if (count == 3) {
                        return 4;//Full House
                    }
                }
                return 2;//Two Pair
            case 5:
            case 7:
                return 4;//Full House
        }
        return 0;//High app.Card
    }

    public static void rankingHand(GameCards gameCards){
        //getting in order
        bubblesort(gameCards);
        //check if exists repeated cards and return:
        //5 - Four of a King | 4 - Full House | 3 - Three of a Kind | 2 - Two Pair | 1 - One Pair
        //0 - High Card/Straight/Flush/Straight Flush/Royal Straight Flush
        int repeatedCard = haveRepeatedCard(gameCards);
        switch (repeatedCard){
            case 0:
            case 1:
            case 2:
            case 3:
                int suitFlush= isFlush(gameCards);
                if (suitFlush==0){
                    gameCards.rankingGame= (isStraight(gameCards))? 4 : repeatedCard;
                    break;
                }
                gameCards.rankingGame= (isStraightFlush(gameCards,suitFlush))?
                        (isRoyalStraightFlush(gameCards,suitFlush))? 9: 8 :5;
                break;
            case 4:
                gameCards.rankingGame=6;//Full House
                break;
            case 5:
                gameCards.rankingGame=7;//Four of a King
                break;
        }
    }
}
