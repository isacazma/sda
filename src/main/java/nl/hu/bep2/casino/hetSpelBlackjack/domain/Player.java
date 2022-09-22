package nl.hu.bep2.casino.hetSpelBlackjack.domain;

public class Player implements Person {
    private Hand hand;

    public Player(Hand hand) {
        this.hand = hand;
    }




    @Override
    public int TotalScoreCardsinHand() {
        return 0;
    }

    @Override
    public Hand getHand() {
        return null;
    }
}
