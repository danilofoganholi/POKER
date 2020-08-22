package app;

import java.util.Arrays;

public class GameCards {
    public Card[] cards=new Card[7];
    public Card[] bestCards = new Card[5];
    public int rankingGame=-1;
    public int level;

    public GameCards(Card hand1, Card hand2) {
        this.cards[0] = hand1;
        this.cards[1] = hand2;
    }

    public void put(Card flop1, Card flop2, Card flop3, Card turn, Card river){
        this.cards[2] = flop1;
        this.cards[3] = flop2;
        this.cards[4] = flop3;
        this.cards[5] = turn;
        this.cards[6] = river;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Card card: cards){
            result.append(card.toString()).append(" | ");
        }
        return result.toString();
    }

    public String toStringBestCards(){
        StringBuilder result = new StringBuilder();
        for(Card card: bestCards){
            result.append(card.toString()).append(" | ");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameCards)) return false;
        GameCards gameCards = (GameCards) o;
        return Arrays.equals(cards, gameCards.cards);
    }
}
