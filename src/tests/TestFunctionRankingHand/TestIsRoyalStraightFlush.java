package tests.TestFunctionRankingHand;

import app.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIsRoyalStraightFlush {
    @Test
    public void testIsRoyalStraightFlush_NormalCaseClubs(){
        Card    a = new Card(13,1),
                b = new Card(1,1),
                c = new Card(12,1),
                d = new Card(10,1),
                e = new Card(11,1),
                f = new Card(8,2),
                g = new Card(3,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);
        String testName = "testIsRoyalStraightFlush_NormalCaseClubs";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,1);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_NormalCaseHearts(){
        Card    a = new Card(13,2),
                b = new Card(1,2),
                c = new Card(12,2),
                d = new Card(10,2),
                e = new Card(11,2),
                f = new Card(8,4),
                g = new Card(3,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_NormalCaseHearts";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,2);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsStraightFlush_NormalCaseSpades(){
        Card    a = new Card(13,3),
                b = new Card(1,3),
                c = new Card(12,3),
                d = new Card(10,3),
                e = new Card(11,3),
                f = new Card(8,4),
                g = new Card(3,4);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_NormalCaseSpades";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,3);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_NormalCaseDiamonds(){
        Card    a = new Card(13,4),
                b = new Card(1,4),
                c = new Card(12,4),
                d = new Card(10,4),
                e = new Card(11,4),
                f = new Card(8,1),
                g = new Card(3,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_NormalCaseDiamonds";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,4);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_AllTheSameSuit(){
        Card    a = new Card(13,4),
                b = new Card(7,4),
                c = new Card(12,4),
                d = new Card(10,4),
                e = new Card(11,4),
                f = new Card(9,4),
                g = new Card(8,4);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_NormalCaseDiamonds";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,4);
        boolean expectedResult = false;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_InOrder(){
        Card    a = new Card(10,4),
                b = new Card(11,4),
                c = new Card(12,4),
                d = new Card(13,4),
                e = new Card(1,4),
                f = new Card(8,1),
                g = new Card(3,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_InOrder";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,4);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_Reverse(){
        Card    a = new Card(5,2),
                b = new Card(4,2),
                c = new Card(1,4),
                d = new Card(13,4),
                e = new Card(12,4),
                f = new Card(11,4),
                g = new Card(10,4);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_Reverse";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,4);
        boolean expectedResult = true;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testIsRoyalStraightFlush_NotStraight(){
        Card a = new Card(1,1),
                b = new Card(7,1),
                c = new Card(5,1),
                d = new Card(8,4),
                e = new Card(10,1),
                f = new Card(11,1),
                g = new Card(13,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testIsRoyalStraightFlush_NotStraight";
        boolean resultObtained = FunctionRankingHand.isRoyalStraightFlush(player1,1);
        boolean expectedResult = false;
        String warning = "\nFunction 'IsRoyalStraightFlush' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();

        assertEquals(warning,expectedResult,resultObtained);
    }
}
