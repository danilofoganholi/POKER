package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFourOfAKind {
    @Test
    public void testGetBestCards_FourOfAKing_NormalCase(){
        Card a = new Card(2,1),
                b = new Card(1,2),
                c = new Card(2,3),
                d = new Card(1,4),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(2,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_FourOfAKing_NormalCase";

        Card[] expectedResult = new Card[]{a,c,f,g,b};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fourOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FourOfAKing' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_FourOfAKing_WithPair(){
        Card a = new Card(6,1),
                b = new Card(1,2),
                c = new Card(6,3),
                d = new Card(1,4),
                e = new Card(1,3),
                f = new Card(1,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_FourOfAKing_WithPair";

        Card[] expectedResult = new Card[]{b,d,e,f,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fourOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FourOfAKing' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_FourOfAKing_WithThreeOfAKind(){
        Card a = new Card(6,1),
                b = new Card(1,2),
                c = new Card(6,3),
                d = new Card(1,4),
                e = new Card(1,3),
                f = new Card(1,1),
                g = new Card(6,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Four Of A King: "+player1);

        String testName = "testGetBestCards_FourOfAKing_WithPair";

        Card[] expectedResult = new Card[]{b,d,e,f,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fourOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FourOfAKing' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
