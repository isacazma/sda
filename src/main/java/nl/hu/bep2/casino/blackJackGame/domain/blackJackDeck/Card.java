package nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Card implements Serializable {
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

    public TypenKaart getTypenKaart() {
        return typenKaart;
    }

    public void setTypenKaart(TypenKaart typenKaart) {
        this.typenKaart = typenKaart;
    }

    public WaardeKaart getWaardeKaart() {
        return waardeKaart;
    }

    public void setWaardeKaart(WaardeKaart waardeKaart) {
        this.waardeKaart = waardeKaart;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Card{" +
                "typenKaart=" + typenKaart +
                ", waardeKaart=" + waardeKaart +
                '}';
    }
}
//     maak one to many maak een sub key niet elke key oplslaan
//als je kaart string doet kan je verwijderen als ERD geen database

//    cascadeType.ALL selecteerd meteen elke subKeys van de andere klassen

//probeer eerst de kaarten te geven en dan de kaart object maken zodat je geen deck heb
