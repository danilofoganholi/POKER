package tests.TestFunctionRankingHand;
import app.Card;
import app.FunctionRankingHand;
import app.GameCards;
import app.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIsStraight {
    @Test
    public void testIsStraight_NormalCase(){
        Card    a = new Card(4,1),
                b = new Card(5,4),
                c = new Card(3,1),
                d = new Card(1,4),
                e = new Card(2,3),
                f = new Card(13,1),
                g = new Card(11,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraight_NormalCase";
        boolean resultObtained = FunctionRankingHand.isStraight(player1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraight_AllSameSuit(){
        Card    a = new Card(4,1),
                b = new Card(5,4),
                c = new Card(3,1),
                d = new Card(1,4),
                e = new Card(2,3),
                f = new Card(13,1),
                g = new Card(11,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraight_NormalCase";
        boolean resultObtained = FunctionRankingHand.isStraight(player1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraight_InOrder(){
        Card a = new Card(1,1),
                b = new Card(2,4),
                c = new Card(3,1),
                d = new Card(4,4),
                e = new Card(5,3),
                f = new Card(10,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraight_InOrder";
        boolean resultObtained = FunctionRankingHand.isStraight(player1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraight_Reverse(){
        Card a = new Card(5,1),
                b = new Card(4,4),
                c = new Card(3,1),
                d = new Card(2,4),
                e = new Card(1,3),
                f = new Card(9,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraight_Reverse";
        boolean resultObtained = FunctionRankingHand.isStraight(player1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraight_NotStraight(){
        Card a = new Card(1,1),
                b = new Card(4,4),
                c = new Card(5,1),
                d = new Card(8,4),
                e = new Card(10,3),
                f = new Card(11,1),
                g = new Card(13,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraight_NotStraight";
        boolean resultObtained = FunctionRankingHand.isStraight(player1);
        boolean expectedResult = false;
        String warning = "\nFunction 'IsStraight' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }
}
