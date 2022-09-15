package nl.hu.bep2.casino.hetSpelBlackjack;

import nl.hu.bep2.casino.Factories.DeckFactory;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
   Deck dealDeck = new Deck();

    private Deck getDealerDeck(){
       dealDeck = new DeckFactory().getRandomDeck();
       return dealDeck;
    }




}
