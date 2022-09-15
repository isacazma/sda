package nl.hu.bep2.casino.Factories;

import nl.hu.bep2.casino.hetSpelBlackjack.Card;
import nl.hu.bep2.casino.hetSpelBlackjack.Deck;
import nl.hu.bep2.casino.hetSpelBlackjack.TypenKaart;
import nl.hu.bep2.casino.hetSpelBlackjack.WaardeKaart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
