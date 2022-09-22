package nl.hu.bep2.casino.hetSpelBlackjack.domain;

import nl.hu.bep2.casino.Factories.DeckFactory;

public class Dealer {
    private Hand hand;
    private Deck deck;

    public Dealer(Deck deck, Hand hand) {
        this.deck = deck;
        this.hand = hand;
    }




    public Hand getHand() {
        return null;
    }

    public Card getCard() {
        return deck.getEenCard();
    }



}
