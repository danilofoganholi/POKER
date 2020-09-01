package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOnePair {
    @Test
    public void testGetBestCards_OnePair_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("One Pair: "+player1);

        String testName = "testGetBestCards_OnePair_NormalCase";

        Card[] expectedResult = new Card[]{b,f,a,d,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.onePair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_OnePair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_OnePair_PairOfA(){
        Card a = new Card(1,1),
                b = new Card(3,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(1,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_OnePair_PairOfA";

        Card[] expectedResult = new Card[]{a,e,d,g,c};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.onePair(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_OnePair' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
