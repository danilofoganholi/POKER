package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRoyalStraightFlush {
    @Test
    public void testRankingHand_RoyalStraightFlush_NormalCase(){
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

        String testName = "testRankingHand_RoyalStraightFlush_NormalCase";
        
        Card[] expectedResult = new Card[]{e,d,c,b,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.royalStrightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_RoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_WithPair(){
        Card a = new Card(1,2),
                b = new Card(2,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(2,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_WithPair";

        Card[] expectedResult = new Card[]{a,g,c,d,e};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.royalStrightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_RoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_TwohPair(){
        Card a = new Card(1,2),
                b = new Card(12,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(13,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_TwohPair";

        Card[] expectedResult = new Card[]{a,g,c,d,e};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.royalStrightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_RoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_ThreeOfAKind(){
        Card a = new Card(1,2),
                b = new Card(13,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(13,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testRankingHand_RoyalStraightFlush_ThreeOfAKind";

        Card[] expectedResult = new Card[]{a,g,c,d,e};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.royalStrightFlush(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_RoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
