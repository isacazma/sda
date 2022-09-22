package nl.hu.bep2.casino.hetSpelBlackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card>cards = new ArrayList<Card>();

private int teller = 0;

public Card getEenCard(){
    teller ++;
    return cards.get(teller);
}


    public void addCard(Card kaart){
        cards.add(kaart);
    }

    public List<Card> getCards() {
        return cards;
    }



}
