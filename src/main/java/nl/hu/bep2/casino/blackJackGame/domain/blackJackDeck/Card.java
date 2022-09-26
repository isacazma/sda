package nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {
    private TypenKaart typenKaart;
    private WaardeKaart waardeKaart;

    @Id
    @GeneratedValue
    private Long id;

    public Card(TypenKaart typenKaart, WaardeKaart waardeKaart) {
        this.typenKaart = typenKaart;
        this.waardeKaart = waardeKaart;
    }

    public Card() {

    }

    @Override
    public String toString() {
        return "Card{" +
                "typenKaart=" + typenKaart +
                ", waardeKaart=" + waardeKaart +
                '}';
    }
}
