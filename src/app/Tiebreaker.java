import app.Card;
import app.GameCards;

public class Tiebreaker {
    /*
    Subtitle

    10 - Royal Straight Flush   = done
    9  - Straight Flush         = done
    8  - Four of a King         = done -
    7  - Full House             = done -
    6  - Flush                  = done
    5  - Straight               = done
    4  - Three of a Kind        = done -
    3  - Two Pair               = done -
    2  - One Pair               = done -
    1  - High app.Card              = done
    */
//    static int Flush(GameCards player1, GameCards player2, int suit){
//        boolean[] havecards = new boolean[13];
//        boolean[] havecards2 = new boolean[13];
//
//        for (Card card : player1.cards){
//            if (card.suit==suit){
//                havecards[(card.value-1)]=true;
//            }
//        }
//        for (Card card : player2.cards){
//            if (card.suit==suit){
//                havecards2[(card.value-1)]=true;
//            }
//        }
//
//        if (havecards[0]){
//            return 1;
//        }
//        if (havecards2[0]){
//            return 2;
//        }
//
//        for (int index=6; index>=0;index--){
//            if (havecards[index] != havecards2[index]){
//                if (havecards[index]){
//                    return 1;
//                }else{
//                    return 2;
//                }
//            }
//        }
//        return 0;
//    }
//
//    static int HighCard(GameCards player1, GameCards player2){
//        int[] numberOfCards = new int[13];
//        int[] numberOfCards2 = new int[13];
//
//        for (Card card : player1.cards){
//            numberOfCards[(card.value-1)]++;
//        }
//
//        for (Card card : player2.cards){
//            numberOfCards2[(card.value-1)]++;
//        }
//
//        // checks if one of these players has a A
//        if (numberOfCards[0]==1 && numberOfCards2[0]!=1){
//            return 1;
//        }else if (numberOfCards[0]!=1 && numberOfCards2[0]==1){
//            return 2;
//        }
//
//        // check which of these players has the highest card
//        for (int index=12; index>=1;index--){
//            if (numberOfCards[index]==1 && numberOfCards2[index]!=1){
//                return 1;
//            }else if (numberOfCards[index]!=1 && numberOfCards2[index]==1){
//                return 2;
//            }
//        }
//        return 0;
//    }
//
//    static int FullHouse(GameCards player1, GameCards player2){
//
//        int ThreeOfAKind = ThreeOfAKind(player1, player2);
//        int OnePairOrTwoPair= OnePairOrTwoPair(player1,player2);
//
//        System.out.println(ThreeOfAKind);
//        System.out.println(OnePairOrTwoPair);
//
//        if (ThreeOfAKind==1){
//            return 1;
//        }else if (ThreeOfAKind==2){
//            return 2;
//        }
//
//        if (OnePairOrTwoPair==1){
//            return 1;
//        }else if (OnePairOrTwoPair==2){
//            return 2;
//        }else {
//            return 0;
//        }
//
//    }
//
//    static int FourOfAKing(GameCards player1, GameCards player2){
//        int[] numberOfCards = new int[13];
//        int[] numberOfCards2 = new int[13];
//
//        int tiebreacker=0;
//
//        int indexTrinca=0, indexDupla=0, index2Duplas=0, indexQuadra =0;
//
//        int idxTrinca=0, idxDupla=0, idx2Duplas=0, idxQuadra =0;
//
//
//        for (Card card : player1.cards){
//            numberOfCards[(card.value-1)]++;
//        }
//
//        for (Card card : player2.cards){
//            numberOfCards2[(card.value-1)]++;
//        }
//
//        for (int index=0; index<=12;index++){
//            if (numberOfCards[index]==2){
//                if (indexDupla==0){
//                    indexDupla=index;
//                }else if (index2Duplas==0){
//                    index2Duplas=index;
//                }else{
//                    indexDupla=index2Duplas;
//                    index2Duplas=index;
//                }
//            }else if (numberOfCards[index]==3){
//                if (indexTrinca==0){
//                    indexTrinca=index;
//                }else {
//                    indexDupla=indexTrinca;
//                    indexTrinca=index;
//                }
//            }else{
//                indexQuadra=index;
//            }
//
//        }
//
//        for (int index=0; index<=12;index++){
//            if (numberOfCards[index]==2){
//                if (idxDupla==0){
//                    idxDupla=index;
//                }else if (idx2Duplas==0){
//                    idx2Duplas=index;
//                }else{
//                    idxDupla=idx2Duplas;
//                    idx2Duplas=index;
//                }
//            }else if (numberOfCards[index]==3){
//                if (idxTrinca==0){
//                    idxTrinca=index;
//                }else {
//                    idxDupla=idxTrinca;
//                    idxTrinca=index;
//                }
//            }else{
//                idxQuadra=index;
//            }
//
//        }
//
//        return 0;
//    }
//
//    static int OnePairOrTwoPair(GameCards player1, GameCards player2){
//        int[] numberOfCards = new int[13];
//        int[] numberOfCards2 = new int[13];
//
//        for (Card card : player1.cards){
//            numberOfCards[(card.value-1)]++;
//        }
//
//        for (Card card : player2.cards){
//            numberOfCards2[(card.value-1)]++;
//        }
//
//        // checks if one of these players has a pair of A's
//        if (numberOfCards[0]==2 && numberOfCards2[0]!=2){
//            return 1;
//        }else if (numberOfCards[0]!=2 && numberOfCards2[0]==2){
//            return 2;
//        }
//
//        // check which of these players has a pair more highest
//        for (int index=12; index>=1;index--){
//            if (numberOfCards[index]==2 && numberOfCards2[index]!=2){
//                return 1;
//            }else if (numberOfCards[index]!=2 && numberOfCards2[index]==2){
//                return 2;
//            }
//        }
//
//        // checks if one of these players has a A
//        if (numberOfCards[0]==1 && numberOfCards2[0]!=1){
//            return 1;
//        }else if (numberOfCards[0]!=1 && numberOfCards2[0]==1){
//            return 2;
//        }
//
//        // check which of these players has the highest card
//        for (int index=12; index>=1;index--){
//            if (numberOfCards[index]==1 && numberOfCards2[index]!=1){
//                return 1;
//            }else if (numberOfCards[index]!=1 && numberOfCards2[index]==1){
//                return 2;
//            }
//        }
//
//        return 0;
//    }
//
//    static int ThreeOfAKind(GameCards player1, GameCards player2){
//        int[] numberOfCards = new int[13];
//        int[] numberOfCards2 = new int[13];
//
//        for (Card card : player1.cards){
//            numberOfCards[(card.value-1)]++;
//        }
//
//        for (Card card : player2.cards){
//            numberOfCards2[(card.value-1)]++;
//        }
//
//        // checks if one of these players have three A's
//        if (numberOfCards[0]==3 && numberOfCards2[0]!=3){
//            return 1;
//        }else if (numberOfCards[0]!=3 && numberOfCards2[0]==3){
//            return 2;
//        }
//
//        // check which of these players have a three of a kind more highest
//        for (int index=12; index>=1;index--){
//            if (numberOfCards[index]==3 && numberOfCards2[index]!=3){
//                return 1;
//            }else if (numberOfCards[index]!=3 && numberOfCards2[index]==3){
//                return 2;
//            }
//        }
//
//        return 0;
//    }
}
