package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFlush {
    @Test
    public void testGetBestCards_Flush_NormalCase(){
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

        String testName = "testGetBestCards_Flush_NormalCase";

        Card[] expectedResult = new Card[]{a,b,d,g,e};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.highCard(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Flush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Flush_AllSameSuit(){
        Card a = new Card(2,1),
                b = new Card(3,1),
                c = new Card(4,1),
                d = new Card(10,1),
                e = new Card(11,1),
                f = new Card(12,1),
                g = new Card(13,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Flush: "+player1);

        String testName = "testGetBestCards_Flush_AllSameSuit";

        Card[] expectedResult = new Card[]{g,f,e,d,c};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.highCard(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Flush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
