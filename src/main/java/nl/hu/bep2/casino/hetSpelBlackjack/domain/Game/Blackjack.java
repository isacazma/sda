package nl.hu.bep2.casino.hetSpelBlackjack.domain.Game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blackjack")
public class Blackjack {
    @Id
    @GeneratedValue
    private Long Id;


}
