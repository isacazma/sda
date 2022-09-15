package nl.hu.bep2.casino;

import nl.hu.bep2.casino.Factories.DeckFactory;
import nl.hu.bep2.casino.hetSpelBlackjack.Deck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CasinoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasinoApplication.class, args);

        DeckFactory deckFactory = new DeckFactory();

        Deck deck =  deckFactory.getRandomDeck();

    }
}
