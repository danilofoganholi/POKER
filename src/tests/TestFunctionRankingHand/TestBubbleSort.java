package tests.TestFunctionRankingHand;
import app.* ;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBubbleSort {
    @Test
    public void testBubbleSort_NormalCase(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(2,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testBubbleSort_NormalCase";
        FunctionRankingHand.bubblesort(player1);
        Card[] resultObtained = player1.cards;
        Card[] expectedResult = {f,b,c,e,g,a,d};
        String warning = "\nFunction 'BubbleSort' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testBubbleSort_AlreadyOrganized(){
        Card    a = new Card(1,1),
                b = new Card(2,2),
                c = new Card(3,3),
                d = new Card(4,4),
                e = new Card(5,1),
                f = new Card(6,2),
                g = new Card(7,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testBubbleSort_AlreadyOrganized";
        FunctionRankingHand.bubblesort(player1);
        Card[] resultObtained = player1.cards;
        Card[] expectedResult = {a,b,c,d,e,f,g};
        String warning = "\nFunction 'BubbleSort' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testBubbleSort_Inverted(){
        Card    a = new Card(10,1),
                b = new Card(9,2),
                c = new Card(8,3),
                d = new Card(7,4),
                e = new Card(6,1),
                f = new Card(5,2),
                g = new Card(4,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testBubbleSort_Inverted";
        FunctionRankingHand.bubblesort(player1);
        Card[] resultObtained = player1.cards;
        Card[] expectedResult = {g,f,e,d,c,b,a};
        String warning = "\nFunction 'BubbleSort' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testBubbleSort_SameValue(){
        Card    a = new Card(10,1),
                b = new Card(10,2),
                c = new Card(9,3),
                d = new Card(7,4),
                e = new Card(2,1),
                f = new Card(9,2),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testBubbleSort_Inverted";
        FunctionRankingHand.bubblesort(player1);
        Card[] resultObtained = player1.cards;
        Card[] expectedResult = {e,g,d,c,f,a,b};
        String warning = "\nFunction 'BubbleSort' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
