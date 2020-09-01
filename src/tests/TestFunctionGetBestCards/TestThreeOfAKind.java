package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestThreeOfAKind {
    @Test
    public void testGetBestCards_ThreeOfAKind_NormalCase(){
        Card a = new Card(1,1),
                b = new Card(2,1),
                c = new Card(4,4),
                d = new Card(2,3),
                e = new Card(6,3),
                f = new Card(2,4),
                g = new Card(8,2);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_ThreeOfAKind_NormalCase";

        Card[] expectedResult = new Card[]{b,d,f,a,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.threeOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_ThreeOfAKind' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_ThreeOfAKind_InTheBeginner(){
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

        String testName = "testGetBestCards_ThreeOfAKind_InTheBeginner";

        Card[] expectedResult = new Card[]{a,b,c,f,g};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.threeOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_ThreeOfAKind' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_ThreeOfAKind_InTheEnd(){
        Card a = new Card(1,3),
                b = new Card(2,2),
                c = new Card(4,1),
                d = new Card(3,4),
                e = new Card(8,3),
                f = new Card(8,2),
                g = new Card(8,1);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_ThreeOfAKind_InTheEnd";

        Card[] expectedResult = new Card[]{e,f,g,a,c};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.threeOfAKind(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_ThreeOfAKind' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
