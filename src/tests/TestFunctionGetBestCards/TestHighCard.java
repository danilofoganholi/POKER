package tests.TestFunctionGetBestCards;

import app.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHighCard {
    @Test
    public void testGetBestCards_HighCard_NormalCase(){
        Card a = new Card(12,1),
                b = new Card(3,2),
                c = new Card(4,3),
                d = new Card(13,4),
                e = new Card(6,1),
                f = new Card(2,1),
                g = new Card(8,3);

        GameCards player1 = new GameCards(a,b);
        player1.put(c,d,e,f,g);

        String testName = "testGetBestCards_HighCard_NormalCase";

        Card[] expectedResult = new Card[]{d,a,g,e,c};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.highCard(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_HighCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }

    @Test
    public void testGetBestCards_HighCard_WIthCardA(){
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

        String testName = "testGetBestCards_HighCard_WIthCardA";
        Card[] expectedResult = new Card[]{f,d,a,g,e};
        FunctionRankingHand.bubblesort(player1);
        FunctionGetBestCards.highCard(player1);
        Card[] resultObtained = player1.bestCards;
        String warning = "\nFunction 'GetBestCards_HighCard' not return expected output.\n" +
                "TEST: "+testName+"\nINPUT: "+player1.toString();
        assertEquals(warning,expectedResult,resultObtained);
    }
}
