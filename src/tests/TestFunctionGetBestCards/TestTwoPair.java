package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTwoPair {
    @Test
    public void testGetBestCards_TwoPair_NormalCase(){
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

        String testName = "testGetBestCards_TwoPair_NormalCase";

        Card[] expectedResult = new Card[]{d,g,b,f,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.twoPair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning =  "\nFunction 'GetBestCards_TwoPair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_TwoPair_InTheBeginner(){
        Card a = new Card(2,1),
                b = new Card(2,2),
                c = new Card(4,4),
                d = new Card(4,3),
                e = new Card(6,3),
                f = new Card(9,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_TwoPair_InTheBeginner";

        Card[] expectedResult = new Card[]{c,d,a,b,f};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.twoPair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning =  "\nFunction 'GetBestCards_TwoPair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_TwoPair_InTheEnd(){
        Card a = new Card(2,1),
                b = new Card(1,2),
                c = new Card(4,4),
                d = new Card(6,3),
                e = new Card(6,1),
                f = new Card(8,2),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Two Pair: "+player1);

        String testName = "testGetBestCards_TwoPair_InTheEnd";

        Card[] expectedResult = new Card[]{f,g,d,e,b};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.twoPair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning =  "\nFunction 'GetBestCards_TwoPair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_TwoPair_ThreePair(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(8,3),
                e = new Card(4,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_TwoPair_ThreePair";

        Card[] expectedResult = new Card[]{d,g,c,e,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.twoPair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_TwoPair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
