package app;

public class FunctionGetBestCards {

    public static void getBestCards(GameCards gameCards){

        if (gameCards.rankingGame==-1){
            FunctionRankingHand.rankingHand(gameCards);
        }

//        System.out.println(Arrays.toString(gameCards.cards));
        switch (gameCards.rankingGame){
            case 0://High Card
                highCard(gameCards);
                break;
            case 1://One Pair
                onePair(gameCards);
                break;
            case 2://Two Pair
                twoPair(gameCards);
                break;
            case 3://Three of a Kind
                threeOfAKind(gameCards);
                break;
            case 4://Stright
                stright(gameCards);
                break;
            case 5://Flush
                flush(gameCards);
                break;
            case 6://Full House
                fullHouse(gameCards);
                break;
            case 7://Four of a King
                fourOfAKind(gameCards);
                break;
            case 8://Straight Flush
                strightFlush(gameCards);
                break;
            case 9://Royal Straight Flush
                royalStrightFlush(gameCards);
                break;
        }
//        System.out.println(Arrays.toString(gameCards.bestCards));
    }

    private static void highCard(GameCards gameCards){
        int j=0, i=6;
        if (gameCards.cards[j].value==1){
            gameCards.bestCards[j]=gameCards.cards[0];
            j++;
        }
        for (;j<=4;j++) {
            gameCards.bestCards[j] = gameCards.cards[i];
            i--;
        }
    }

    private static void onePair(GameCards gameCards) {
        int value=0;//value of pair
        int j=0;//index of array best cards

        for(int i=0; i<=6;i++){//put the pair at the beginning
            if (gameCards.cards[i].value==gameCards.cards[i+1].value){
                value=gameCards.cards[i].value;//save the value of pair
                gameCards.bestCards[j]=gameCards.cards[i];
                gameCards.bestCards[++j]=gameCards.cards[i+1];
                break;
            }
        }

        if (value!=1 &&gameCards.cards[0].value==1){//check if have a As
            gameCards.bestCards[++j]=gameCards.cards[0];
        }

        //fill the rest of array best cards
        for (int i=6; i>=0; i--){
            if (gameCards.cards[i].value!=value){
                gameCards.bestCards[++j]=gameCards.cards[i];
            }
            if (j>=4){
                break;
            }
        }
    }

    private static void twoPair(GameCards gameCards) {
        int value=0,//value of pair
        value1 = 0; // second pair

        if (gameCards.cards[0].value==1 && gameCards.cards[1].value==1){
            value=1;
            gameCards.bestCards[0]=gameCards.cards[0];
            gameCards.bestCards[1]=gameCards.cards[1];
        }else {
            for(int i=6; i>=1;i--){//put the pair at the beginning
                if (gameCards.cards[i].value==gameCards.cards[i-1].value){
                    value=gameCards.cards[i].value;//save the value of first pair
                    gameCards.bestCards[0]=gameCards.cards[i-1];
                    gameCards.bestCards[1]=gameCards.cards[i];
                    break;
                }
            }
        }

        for(int i=6; i>=1;i--){//put the second pair after first pair
            if (gameCards.cards[i].value!=value && gameCards.cards[i].value==gameCards.cards[i-1].value){
                value1=gameCards.cards[i].value;//save the value of second pair
                gameCards.bestCards[2]=gameCards.cards[i-1];
                gameCards.bestCards[3]=gameCards.cards[i];
                break;
            }
        }

        if (value!=1 && gameCards.cards[0].value==1){//check if have a As
            gameCards.bestCards[4]=gameCards.cards[0];
        }else {
            //fill the rest of array best cards
            for (int i=6; i>=0; i--){
                if (gameCards.cards[i].value!=value && gameCards.cards[i].value!=value1){
                    gameCards.bestCards[4]=gameCards.cards[i];
                }
            }
        }
    }

    private static void threeOfAKind(GameCards gameCards) {
        int value=0;//value of Three Of A Kind
        if (gameCards.cards[0].value==1 && gameCards.cards[1].value==1){
            gameCards.bestCards[0]=gameCards.cards[0];
            gameCards.bestCards[1]=gameCards.cards[1];
            gameCards.bestCards[2]=gameCards.cards[2];
        }else {
            for (int j=6; j>=2; j--){//put Three of a Kind in the begin of array bestCards
                if (gameCards.cards[j].value==gameCards.cards[j-1].value){
                    value=gameCards.cards[j].value;
                    gameCards.bestCards[0]=gameCards.cards[j-2];
                    gameCards.bestCards[1]=gameCards.cards[j-1];
                    gameCards.bestCards[2]=gameCards.cards[j];
                    break;
                }
            }
        }
        if (gameCards.cards[0].value==1){
            gameCards.bestCards[3]=gameCards.cards[0];
            for (int j=6; j>=0;j--){
                if (gameCards.cards[j].value!=value){
                    gameCards.bestCards[4]=gameCards.cards[j];
                    break;
                }
            }
        }else{//fill the rest of the array
            for (int j=6;j>=0;j--){
                if (gameCards.cards[j].value!=value){
                    if (gameCards.bestCards[3]==null){
                        gameCards.bestCards[3]=gameCards.cards[j];
                    }else {
                        gameCards.bestCards[4]=gameCards.cards[j];
                        break;
                    }
                }
            }
        }
    }

    private static void stright(GameCards gameCards){
        boolean[] havecards = new boolean[13];
        int value=0;
        for (Card card : gameCards.cards){//get only values exists or not
            havecards[(card.value-1)]=true;
        }
        for (int index=0; index<=9;index++){//get the first element of stright
            if ((index==9 && havecards[index] && havecards[index+1] && havecards[index+2] && havecards[index+3]
                    && havecards[0]) || (havecards[index] && havecards[index+1] && havecards[index+2] &&
                    havecards[index+3] && havecards[index+4]) ){
                value = index+1;
                break;
            }
        }
        if (value==9){
            gameCards.bestCards[0]=gameCards.cards[0];
            for (int index=1, count=4, i=6; index<=4; i--){//fill the bestCards with a stright
                if (gameCards.cards[i].value==value+count){
                    gameCards.bestCards[index]=gameCards.cards[i];
                    index++;count--;
                }
            }
        }else {
            for (int index=0, count=4, i=6; index<=4; i--){//fill the bestCards with a stright
                if (gameCards.cards[i].value==value+count){
                    gameCards.bestCards[index]=gameCards.cards[i];
                    index++;count--;
                }
            }
        }
    }

    private static void flush(GameCards gameCards){
        int value=0;
        int suitFlush = FunctionRankingHand.isFlush(gameCards);//get the suit of flush
        // if the first card is A and has the same flush suit, then it is the highest card
        if (gameCards.cards[0].value==1 && gameCards.cards[0].suit==suitFlush){
            gameCards.bestCards[0]=gameCards.cards[0];
            value++;
        }
        for (int index=6; index>=0 && value<=4;index--){//fill the rest of array bestCards with the same suit
            if (gameCards.cards[index].suit==suitFlush){
                gameCards.bestCards[value]=gameCards.cards[index];
                value++;
            }
        }
    }

    private static void fullHouse(GameCards gameCards) {
        int value=0;//value of Three Of A Kind
        for (int j=6; j>=2; j--){//put Three of a Kind in the begin of array bestCards
            if (gameCards.cards[j].value==gameCards.cards[j-1].value &&
                    gameCards.cards[j].value==gameCards.cards[j-2].value){
                value=gameCards.cards[j].value;
                gameCards.bestCards[0]=gameCards.cards[j-2];
                gameCards.bestCards[1]=gameCards.cards[j-1];
                gameCards.bestCards[2]=gameCards.cards[j];
                break;
            }
        }
        for(int i=6; i>=1;i--){//put the pair at the beginning
            if (gameCards.cards[i].value!=value && gameCards.cards[i].value==gameCards.cards[i-1].value){
                gameCards.bestCards[3]=gameCards.cards[i-1];
                gameCards.bestCards[4]=gameCards.cards[i];
                break;
            }
        }
    }

    private static void fourOfAKind(GameCards gameCards) {
        int value=0;//value of Four Of A Kind

        for (int i =6;i>=3;i--){
            if (gameCards.cards[i].value==gameCards.cards[i-1].value &&
                    gameCards.cards[i-2].value==gameCards.cards[i-3].value){
                value=gameCards.cards[i].value;
                gameCards.bestCards[0]=gameCards.cards[i-3];
                gameCards.bestCards[1]=gameCards.cards[i-2];
                gameCards.bestCards[2]=gameCards.cards[i-1];
                gameCards.bestCards[3]=gameCards.cards[i];
            }
        }

        if (value!=1 && gameCards.cards[0].value==1){//check if have a As
            gameCards.bestCards[4]=gameCards.cards[0];
        }else {
            for (int i=6; i>=0; i--){//fill the rest of array best cards
                if (gameCards.cards[i].value!=value){
                    gameCards.bestCards[4]=gameCards.cards[i];
                    break;
                }
            }
        }
    }

    private static void strightFlush(GameCards gameCards){
        int flushSuit = FunctionRankingHand.isFlush(gameCards);//get the suit of flush

        for (int index=0, i=6; i>=0;i--){
            if (gameCards.cards[i].suit==flushSuit){
                gameCards.bestCards[index]=gameCards.cards[i];
                index++;
            }
            if (index>=5){
                break;
            }
        }
    }

    private static void royalStrightFlush(GameCards gameCards){
        int flushSuit1 = FunctionRankingHand.isFlush(gameCards);//get the suit of flush
        for (Card card:gameCards.cards){
            if (card.suit==flushSuit1){
                switch (card.value){
                    case 10:
                        gameCards.bestCards[4]=card;
                        break;
                    case 11:
                        gameCards.bestCards[3]=card;
                        break;
                    case 12:
                        gameCards.bestCards[2]=card;
                        break;
                    case 13:
                        gameCards.bestCards[1]=card;
                        break;
                    case 1:
                        gameCards.bestCards[0]=card;
                        break;
                }
            }
        }////fill the bestCards
    }
}
