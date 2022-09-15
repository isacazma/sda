package nl.hu.bep2.casino.hetSpelBlackjack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Deck {
//    List<Card>cards = new ArrayList<Card>();
private final Deque<Card> cards;

    public Deck() {
        cards = null;
    }

    public void addCard(Card kaart){
        cards.add(kaart);
    }
  

    public Deque<Card> getCards() {
        return cards;
    }
}
