package tests.TestFunctionRankingHand;
import app.* ;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHaveRepeatedCard {
    @Test
    public void testHaveRepeatedCard_HighCard(){
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

        String testName = "testHaveRepeatedCard_HighCard";
        int expectedResult = 0;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_OnePair(){
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

        String testName = "testHaveRepeatedCard_OnePair";
        int expectedResult = 1;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_TwoPair(){
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

        String testName = "testHaveRepeatedCard_TwoPair";
        int expectedResult = 2;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_ThreeOfAKind(){
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

        String testName = "testHaveRepeatedCard_ThreeOfAKind";
        int expectedResult = 3;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_Straight(){
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

        String testName = "testHaveRepeatedCard_Straight";
        int expectedResult = 0;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_Flush(){
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

        String testName = "testHaveRepeatedCard_Flush";
        int expectedResult = 0;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_FullHouse(){
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

        String testName = "testHaveRepeatedCard_FullHouse";
        int expectedResult = 4;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_FourOfAKing(){
        Card a = new Card(1,1),
                b = new Card(1,2),
                c = new Card(1,3),
                d = new Card(1,4),
                e = new Card(6,3),
                f = new Card(2,1),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Four Of A King: "+player1);

        String testName = "testHaveRepeatedCard_FourOfAKing";
        int expectedResult = 5;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_StraightFlush(){
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

        String testName = "testHaveRepeatedCard_StraightFlush";
        int expectedResult = 0;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_RoyalStraightFlush(){
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

        String testName = "testHaveRepeatedCard_RoyalStraightFlush";
        int expectedResult = 0;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_ThreePair(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(8,3),
                e = new Card(4,3),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testHaveRepeatedCard_ThreePair";
        int expectedResult = 2;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testHaveRepeatedCard_TwoThreeOfAKind(){
        Card a = new Card(2,4),
                b = new Card(2,1),
                c = new Card(9,4),
                d = new Card(9,3),
                e = new Card(9,2),
                f = new Card(2,2),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        //System.out.println("Full House: "+player1);

        String testName = "testHaveRepeatedCard_TwoThreeOfAKind";
        int expectedResult = 4;
        int resultObtained = FunctionRankingHand.haveRepeatedCard(player1);
        String warning = "\nFunction 'HaveRepeatedCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

}
