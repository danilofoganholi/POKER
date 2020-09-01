package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestStraight {
    @Test
    public void testGetBestCards_Straight_NormalCase(){
        Card a = new Card(6,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(3,3),
                e = new Card(11,3),
                f = new Card(5,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_NormalCase";

        Card[] expectedResult = new Card[]{a,f,c,d,b};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_InOrder(){
        Card a = new Card(2,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(5,4),
                e = new Card(6,1),
                f = new Card(9,1),
                g = new Card(11,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_InOrder";

        Card[] expectedResult = new Card[]{e,d,c,b,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_ReverseOrder(){
        Card a = new Card(12,1),
                b = new Card(9,2),
                c = new Card(6,3),
                d = new Card(5,4),
                e = new Card(4,1),
                f = new Card(3,1),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_ReverseOrder";

        Card[] expectedResult = new Card[]{c,d,e,f,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_WithAInTheBeginner(){
        Card a = new Card(1,1),
                b = new Card(5,2),
                c = new Card(3,3),
                d = new Card(2,4),
                e = new Card(4,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_WithAInTheBeginner";

        Card[] expectedResult = new Card[]{b,e,c,d,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_WithAInTheEnd(){
        Card a = new Card(10,1),
                b = new Card(5,2),
                c = new Card(12,3),
                d = new Card(1,4),
                e = new Card(4,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_WithAInTheEnd";

        Card[] expectedResult = new Card[]{d,g,c,f,a};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_Straight_AllInStraigth(){
        Card a = new Card(10,1),
                b = new Card(7,2),
                c = new Card(12,3),
                d = new Card(9,4),
                e = new Card(8,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_Straight_AllInStraigth";

        Card[] expectedResult = new Card[]{g,c,f,a,d};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.stright(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_Straight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
