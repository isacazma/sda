package nl.hu.bep2.casino.hetSpelBlackjack.domain;

public class Card {
    private TypenKaart typenKaart;
    private WaardeKaart waardeKaart;

    public Card(TypenKaart typenKaart, WaardeKaart waardeKaart) {
        this.typenKaart = typenKaart;
        this.waardeKaart = waardeKaart;
    }

    @Override
    public String toString() {
        return "Card{" +
                "typenKaart=" + typenKaart +
                ", waardeKaart=" + waardeKaart +
                '}';
    }
}
