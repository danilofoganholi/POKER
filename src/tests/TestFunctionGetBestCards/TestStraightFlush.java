package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestStraightFlush {
    @Test
    public void testGetBestCards_StraightFlush_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(5,1),
                f = new Card(11,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testGetBestCards_StraightFlush_NormalCase";

        Card[] expectedResult = new Card[]{e,d,c,b,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.strightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_StraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_StraightFlush_WithPair(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(11,2),
                g = new Card(11,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testGetBestCards_StraightFlush_WithPair";

        Card[] expectedResult = new Card[]{b,d,c,e,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.strightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_StraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_StraightFlush_TwohPair(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(5,2),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testGetBestCards_StraightFlush_TwohPair";

        Card[] expectedResult = new Card[]{b,d,c,e,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.strightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_StraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_StraightFlush_ThreeOfAKind(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(2,2),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testGetBestCards_StraightFlush_ThreeOfAKind";

        Card[] expectedResult = new Card[]{b,d,c,e,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.strightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_StraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
