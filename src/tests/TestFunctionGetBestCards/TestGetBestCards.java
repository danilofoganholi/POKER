package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGetBestCards {
    @Test
    public void testGetBestCards_HighCard(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(2,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High Card: "+player1);

        String testName = "testGetBestCards_HighCard";
        Card[] expectedResult = new Card[]{d,a,g,e,c};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
                String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_HighCard_WithA(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(1,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High Card: "+player1);

        String testName = "testGetBestCards_HighCardWhitA";
        Card[] expectedResult = new Card[]{f,d,a,g,e};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    ///////////////////////////////////////////////////
    @Test
    public void testGetBestCards_OnePair(){
        Card    a = new Card(11,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("One Pair: "+player1);

        String testName = "testGetBestCards_OnePair";
        Card[] expectedResult = new Card[]{b,f,a,d,g};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_OnePair_WithA(){
        Card    a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("One Pair: "+player1);

        String testName = "testGetBestCards_OnePairWithA";
        Card[] expectedResult = new Card[]{b,f,a,d,g};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_TwoPair(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(8,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Two Pair: "+player1);

        String testName = "testGetBestCards_TwoPair";
        Card[] expectedResult = new Card[]{d,g,b,f,a};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_ThreeOfAKind(){
        Card    a = new Card(11,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(2,3),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

//        System.out.println("Three Of A Kind: "+ Arrays.toString(player1.cards));

        String testName = "testGetBestCards_ThreeOfAKind";
        Card[] expectedResult = new Card[]{b,d,f,a,g};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_ThreeOfAKind_WithAS(){
        Card    a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(2,3),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

//        System.out.println("Three Of A Kind: "+ Arrays.toString(player1.cards));

        String testName = "testGetBestCards_ThreeOfAKindWithAS";
        Card[] expectedResult = new Card[]{b,d,f,a,g};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_Straight(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(3,3),
                e = new Card(11,3),
                f = new Card(5,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight: "+player1);

        String testName = "testGetBestCards_Straight";
        Card[] expectedResult = new Card[]{f,c,d,b,a};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_NormalStraight(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(3,3),
                e = new Card(11,3),
                f = new Card(5,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight: "+player1);

        String testName = "testGetBestCards_Straight";
        Card[] expectedResult = new Card[]{f,c,d,b,a};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_BetterCombination(){
        Card a = new Card(5,1),
                b = new Card(13,1),
                c = new Card(10,4),
                d = new Card(1,3),
                e = new Card(11,3),
                f = new Card(12,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight: "+player1);

        String testName = "testGetBestCards_Straight";
        Card[] expectedResult = new Card[]{d,b,f,e,c};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_WithPair(){
        Card a = new Card(1,1),
                b = new Card(13,1),
                c = new Card(10,4),
                d = new Card(1,3),
                e = new Card(11,3),
                f = new Card(12,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight: "+player1);

        String testName = "testGetBestCards_Straight";
        Card[] expectedResult = new Card[]{a,b,f,e,c};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_Flush(){
        Card a = new Card(1,1),
                b = new Card(11,1),
                c = new Card(4,1),
                d = new Card(9,3),
                e = new Card(6,3),
                f = new Card(2,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Flush: "+player1);

        String testName = "testGetBestCards_Flush";
        Card[] expectedResult = new Card[]{a,b,g,c,f};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_FullHouse(){
        Card    a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(9,4),
                d = new Card(9,3),
                e = new Card(9,2),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_FullHouse";
        Card[] expectedResult = new Card[]{c,d,e,b,f};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_FourOfAKing(){
        Card a = new Card(1,1),
                b = new Card(1,2),
                c = new Card(1,3),
                d = new Card(1,4),
                e = new Card(6,3),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Four Of A King: "+player1);

        String testName = "testGetBestCards_FourOfAKing";
        Card[] expectedResult = new Card[]{a,b,c,d,g};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_StraightFlush(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(5,1),
                f = new Card(11,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_StraightFlush";
        Card[] expectedResult = new Card[]{e,d,c,b,a};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

    @Test
    public void testGetBestCards_RoyalStraightFlush(){
        Card a = new Card(10,2),
                b = new Card(11,2),
                c = new Card(12,2),
                d = new Card(13,2),
                e = new Card(1,2),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testGetBestCards_RoyalStraightFlush";
        Card[] expectedResult = new Card[]{e,d,c,b,a};
        FunctionGetBestCards.getBestCards(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertArrayEquals(warning, expectedResult, resultObtained);
    }

    //////////////////////////////////////////////////

}
