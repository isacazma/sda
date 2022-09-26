package nl.hu.bep2.casino.blackJackGame.presentation;

import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Card;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Deck;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.TypenKaart;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.WaardeKaart;

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
