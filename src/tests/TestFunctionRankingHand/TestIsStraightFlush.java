package tests.TestFunctionRankingHand;

import app.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIsStraightFlush {
    @Test
    public void testIsStraightFlush_NormalCaseClubs(){
        Card    a = new Card(4,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(1,1),
                e = new Card(2,1),
                f = new Card(13,2),
                g = new Card(11,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_NormalCaseClubs";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_NormalCaseHearts(){
        Card    a = new Card(4,2),
                b = new Card(5,2),
                c = new Card(3,2),
                d = new Card(1,2),
                e = new Card(2,2),
                f = new Card(13,3),
                g = new Card(11,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_NormalCaseHearts";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,2);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_NormalCaseSpades(){
        Card    a = new Card(4,3),
                b = new Card(5,3),
                c = new Card(3,3),
                d = new Card(1,3),
                e = new Card(2,3),
                f = new Card(13,4),
                g = new Card(11,4);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_NormalCaseSpades";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,3);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_NormalCaseDiamonds(){
        Card    a = new Card(4,4),
                b = new Card(5,4),
                c = new Card(3,4),
                d = new Card(1,4),
                e = new Card(2,4),
                f = new Card(13,1),
                g = new Card(11,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_NormalCaseDiamonds";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,4);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_InOrder(){
        Card    a = new Card(1,3),
                b = new Card(2,3),
                c = new Card(3,3),
                d = new Card(4,3),
                e = new Card(5,3),
                f = new Card(10,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_InOrder";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,3);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_Reverse(){
        Card    a = new Card(5,4),
                b = new Card(4,4),
                c = new Card(3,4),
                d = new Card(2,4),
                e = new Card(1,4),
                f = new Card(9,1),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_Reverse";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,4);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_NotStraight(){
        Card a = new Card(1,1),
                b = new Card(4,1),
                c = new Card(5,1),
                d = new Card(8,4),
                e = new Card(10,3),
                f = new Card(11,1),
                g = new Card(13,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsStraightFlush_NotStraight";
        boolean resultObtained = FunctionRankingHand.isStraightFlush(player1,1);
        boolean expectedResult = false;
        String warning = "\nFunction 'IsStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }
}
