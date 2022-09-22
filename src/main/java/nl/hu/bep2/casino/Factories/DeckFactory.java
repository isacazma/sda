package nl.hu.bep2.casino.Factories;

import nl.hu.bep2.casino.hetSpelBlackjack.domain.Card;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Deck;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.TypenKaart;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.WaardeKaart;

import java.util.Collections;

public class DeckFactory {

    public Deck getDeck(){

        Deck deck = new Deck();

        for (TypenKaart type : TypenKaart.values()){

            for (WaardeKaart waarde : WaardeKaart.values()){

                Card card = new Card(type,waarde);
                deck.addCard(card);
            }
        }
        return deck;
    }

    public Deck getRandomDeck(){
        Deck deck = getDeck();
        Collections.shuffle(deck.getCards());
        return deck;
    }

}
