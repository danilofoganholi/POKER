package tests.TestFunctionRankingHand;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRankingHand {
    ////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_HighCard_NormalCase(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(2,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_HighCard_NormalCase";
        int expectedResult = 0;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_HighCard_WIthCardA(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(1,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_HighCard_WIthCardA";
        int expectedResult = 0;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    ///////////////////////////////////////////////////////
    @Test
    public void testRankingHand_OnePair_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testRankingHand_OnePair_NormalCase";
        int expectedResult = 1;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_OnePair_PairOfA(){
        Card a = new Card(1,1),
                b = new Card(3,1),
                c = new Card(4,4),
                d = new Card(9,3),
                e = new Card(1,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("One Pair: "+player1);

        String testName = "testRankingHand_OnePair_PairOfA";
        int expectedResult = 1;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    //////////////////////////////////////////////////////
    @Test
    public void testRankingHand_TwoPair_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(8,3),
                e = new Card(6,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Two Pair: "+player1);

        String testName = "testRankingHand_TwoPair_NormalCase";
        int expectedResult = 2;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning =  "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_TwoPair_InTheBeginner(){
        Card a = new Card(2,1),
                b = new Card(2,2),
                c = new Card(4,4),
                d = new Card(4,3),
                e = new Card(6,3),
                f = new Card(9,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Two Pair: "+player1);

        String testName = "testRankingHand_TwoPair_InTheBeginner";
        int expectedResult = 2;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning =  "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_TwoPair_InTheEnd(){
        Card a = new Card(2,1),
                b = new Card(1,2),
                c = new Card(4,4),
                d = new Card(6,3),
                e = new Card(6,1),
                f = new Card(8,2),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Two Pair: "+player1);

        String testName = "testRankingHand_TwoPair_InTheEnd";
        int expectedResult = 2;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning =  "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_TwoPair_ThreePair(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(8,3),
                e = new Card(4,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testRankingHand_TwoPair_ThreePair";
        int expectedResult = 2;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    /////////////////////////////////////////////////////
    @Test
    public void testRankingHand_ThreeOfAKind_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(2,3),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Three Of A Kind: "+player1);

        String testName = "testRankingHand_ThreeOfAKind_NormalCase";
        int expectedResult = 3;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_ThreeOfAKind_InTheBeginner(){
        Card a = new Card(7,1),
                b = new Card(7,2),
                c = new Card(7,3),
                d = new Card(2,1),
                e = new Card(6,2),
                f = new Card(9,3),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Three Of A Kind: "+player1);

        String testName = "testRankingHand_ThreeOfAKind_InTheBeginner";
        int expectedResult = 3;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_ThreeOfAKind_InTheEnd(){
        Card a = new Card(1,3),
                b = new Card(2,2),
                c = new Card(4,1),
                d = new Card(3,4),
                e = new Card(8,3),
                f = new Card(8,2),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Three Of A Kind: "+player1);

        String testName = "testRankingHand_ThreeOfAKind_InTheEnd";
        int expectedResult = 3;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    ///////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_Straight_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(3,3),
                e = new Card(11,3),
                f = new Card(5,1),
                g = new Card(9,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight: "+player1);

        String testName = "testRankingHand_Straight_NormalCase";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Straight_InOrder(){
        Card a = new Card(2,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(5,4),
                e = new Card(6,1),
                f = new Card(9,1),
                g = new Card(11,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_Straight_InOrder";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Straight_ReverseOrder(){
        Card a = new Card(12,1),
                b = new Card(9,2),
                c = new Card(6,3),
                d = new Card(5,4),
                e = new Card(4,1),
                f = new Card(3,1),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_Straight_ReverseOrder";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Straight_WithAInTheBeginner(){
        Card a = new Card(1,1),
                b = new Card(5,2),
                c = new Card(3,3),
                d = new Card(2,4),
                e = new Card(4,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_Straight_WithAInTheBeginner";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Straight_WithAInTheEnd(){
        Card a = new Card(10,1),
                b = new Card(5,2),
                c = new Card(12,3),
                d = new Card(1,4),
                e = new Card(4,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_Straight_WithAInTheEnd";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Straight_AllInStraigth(){
        Card a = new Card(10,1),
                b = new Card(7,2),
                c = new Card(12,3),
                d = new Card(9,4),
                e = new Card(8,1),
                f = new Card(11,1),
                g = new Card(13,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("High app.Card: "+player1);

        String testName = "testRankingHand_Straight_AllInStraigth";
        int expectedResult = 4;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    /////////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_Flush_NormalCase(){
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

        String testName = "testRankingHand_Flush_NormalCase";
        int expectedResult = 5;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_Flush_AllSameSuit(){
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

        String testName = "testRankingHand_Flush_AllSameSuit";
        int expectedResult = 5;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    ///////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_FullHouse_NormalCase(){
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

        String testName = "testRankingHand_FullHouse_NormalCase";
        int expectedResult = 6;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_FullHouse_PairBeforeTheeOfAKind(){
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

        String testName = "testRankingHand_FullHouse_PairBeforeTheeOfAKind";
        int expectedResult = 6;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_FullHouse_OneThreeOfAKindAndTwoPairs(){
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

        String testName = "testRankingHand_FullHouse_OneThreeOfAKindAndTwoPairs";
        int expectedResult = 6;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_FullHouse_TwoThreeOfAKind(){
        Card a = new Card(8,1),
                b = new Card(2,1),
                c = new Card(4,2),
                d = new Card(8,3),
                e = new Card(2,4),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Three Of A Kind: "+player1);

        String testName = "testRankingHand_FullHouse_TwoThreeOfAKind";
        int expectedResult = 6;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    ///////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_FourOfAKing_NormalCase(){
        Card a = new Card(2,1),
                b = new Card(1,2),
                c = new Card(2,3),
                d = new Card(1,4),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(2,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Four Of A King: "+player1);

        String testName = "testRankingHand_FourOfAKing_NormalCase";
        int expectedResult = 7;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_FourOfAKing_WithPair(){
        Card a = new Card(6,1),
                b = new Card(1,2),
                c = new Card(6,3),
                d = new Card(1,4),
                e = new Card(1,3),
                f = new Card(1,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Four Of A King: "+player1);

        String testName = "testRankingHand_FourOfAKing_WithPair";
        int expectedResult = 7;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_FourOfAKing_WithThreeOfAKind(){
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

        String testName = "testRankingHand_FourOfAKing_WithPair";
        int expectedResult = 7;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    //////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_StraightFlush_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(5,1),
                f = new Card(11,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testRankingHand_StraightFlush_NormalCase";
        int expectedResult = 8;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_StraightFlush_WithPair(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(11,2),
                g = new Card(11,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testRankingHand_StraightFlush_WithPair";
        int expectedResult = 8;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_StraightFlush_TwohPair(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(5,2),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testRankingHand_StraightFlush_TwohPair";
        int expectedResult = 8;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_StraightFlush_ThreeOfAKind(){
        Card a = new Card(1,1),
                b = new Card(5,1),
                c = new Card(3,1),
                d = new Card(4,1),
                e = new Card(2,1),
                f = new Card(2,2),
                g = new Card(2,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Straight Flush: "+player1);

        String testName = "testRankingHand_StraightFlush_ThreeOfAKind";
        int expectedResult = 8;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    /////////////////////////////////////////////////////////////
    @Test
    public void testRankingHand_RoyalStraightFlush_NormalCase(){
        Card a = new Card(10,2),
                b = new Card(11,2),
                c = new Card(12,2),
                d = new Card(13,2),
                e = new Card(1,2),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_NormalCase";
        int expectedResult = 9;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_WithPair(){
        Card a = new Card(1,2),
                b = new Card(2,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(2,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_WithPair";
        int expectedResult = 9;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_TwohPair(){
        Card a = new Card(1,2),
                b = new Card(12,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(13,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_TwohPair";
        int expectedResult = 9;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testRankingHand_RoyalStraightFlush_ThreeOfAKind(){
        Card a = new Card(1,2),
                b = new Card(13,3),
                c = new Card(12,2),
                d = new Card(11,2),
                e = new Card(10,2),
                f = new Card(13,1),
                g = new Card(13,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Royal Straight Flush: "+player1);

        String testName = "testRankingHand_RoyalStraightFlush_ThreeOfAKind";
        int expectedResult = 9;
        FunctionRankingHand.rankingHand(player1);
        int resultObtained = player1.rankingGame;
        String warning = "\nFunction 'RankingHand' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    /////////////////////////////////////////////////////////////
}
