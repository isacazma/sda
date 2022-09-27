package nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hand {

    @OneToMany(cascade = CascadeType.ALL)
    private final List<Card> cards = new ArrayList<>();
    @Id
    @GeneratedValue
    private Long id;

    public Hand() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



        public void addCard(Card card) {
            this.cards.add(card);
        }

    }
