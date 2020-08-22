package tests.TestFunctionRankingHand;
import app.Card;
import app.FunctionRankingHand;
import app.GameCards;
import app.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIsFlush {
    @Test
    public void testIsFlush_FlushOfClubs(){
        Card a = new Card(12,1),
                b = new Card(3,1),
                c = new Card(4,1),
                d = new Card(13,4),
                e = new Card(6,3),
                f = new Card(2,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsFlush_FlushOfClubs";
        int resultObtained = FunctionRankingHand.isFlush(player1);
        int expectedResult = 1;
        String warning = "\nFunction 'IsFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsFlush_FlushOfHearts(){
        Card a = new Card(12,2),
                b = new Card(3,2),
                c = new Card(4,2),
                d = new Card(13,4),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsFlush_FlushOfHearts";
        int resultObtained = FunctionRankingHand.isFlush(player1);
        int expectedResult = 2;
        String warning = "\nFunction 'IsFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsFlush_FlushOfSpades(){
        Card a = new Card(12,3),
                b = new Card(3,3),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,3),
                f = new Card(2,3),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsFlush_FlushOfSpades";
        int resultObtained = FunctionRankingHand.isFlush(player1);
        int expectedResult = 3;
        String warning = "\nFunction 'IsFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsFlush_FlushOfDiamonds(){
        Card a = new Card(12,4),
                b = new Card(3,4),
                c = new Card(4,4),
                d = new Card(13,4),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsFlush_FlushOfDiamonds";
        int resultObtained = FunctionRankingHand.isFlush(player1);
        int expectedResult = 4;
        String warning = "\nFunction 'IsFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testQuickSort_NotFlush(){
        Card    a = new Card(1,1),
                b = new Card(2,2),
                c = new Card(3,3),
                d = new Card(4,4),
                e = new Card(5,1),
                f = new Card(6,2),
                g = new Card(7,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testQuickSort_NotFlush";
        int resultObtained = FunctionRankingHand.isFlush(player1);
        int expectedResult = 0;
        String warning = "\nFunction 'IsFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}