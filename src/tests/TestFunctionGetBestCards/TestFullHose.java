package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFullHose {
    @Test
    public void testGetBestCards_FullHouse_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(9,4),
                d = new Card(9,3),
                e = new Card(9,2),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Full House: "+player1);

        String testName = "testGetBestCards_FullHouse_NormalCase";

        Card[] expectedResult = new Card[]{c,d,e,b,f};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fullHouse(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FullHouse' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_FullHouse_PairBeforeTheeOfAKind(){
        Card a = new Card(1,1),
                b = new Card(1,2),
                c = new Card(9,4),
                d = new Card(9,3),
                e = new Card(9,2),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Full House: "+player1);

        String testName = "testGetBestCards_FullHouse_PairBeforeTheeOfAKind";
        
        Card[] expectedResult = new Card[]{c,d,e,a,b};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fullHouse(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FullHouse' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_FullHouse_OneThreeOfAKindAndTwoPairs(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(9,4),
                d = new Card(9,3),
                e = new Card(9,2),
                f = new Card(2,2),
                g = new Card(1,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Full House: "+player1);

        String testName = "testGetBestCards_FullHouse_OneThreeOfAKindAndTwoPairs";

        Card[] expectedResult = new Card[]{c,d,e,a,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fullHouse(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FullHouse' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_FullHouse_TwoThreeOfAKind(){
        Card a = new Card(8,1),
                b = new Card(2,1),
                c = new Card(4,2),
                d = new Card(8,3),
                e = new Card(2,4),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_FullHouse_TwoThreeOfAKind";

        Card[] expectedResult = new Card[]{a,d,g,e,f};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.fullHouse(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_FullHouse' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
