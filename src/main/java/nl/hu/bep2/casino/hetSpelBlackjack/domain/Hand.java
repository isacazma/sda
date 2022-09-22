package nl.hu.bep2.casino.hetSpelBlackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Hand {
//    List<Card> persoonelijkeKaarten = new ArrayList<Card>();
//
//    public void addCard(Card kaart){
//        persoonelijkeKaarten.add(kaart);
//    }
//
//    public List<Card> getKaarten(){
//        return persoonelijkeKaarten;
//    }


        private List<Card> cards = new ArrayList<>();

        public Hand() {}

        public void addCard(Card card) {
            this.cards.add(card);
        }

    }
