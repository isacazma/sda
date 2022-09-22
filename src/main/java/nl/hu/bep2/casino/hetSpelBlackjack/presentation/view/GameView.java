package nl.hu.bep2.casino.hetSpelBlackjack.presentation.view;

import nl.hu.bep2.casino.hetSpelBlackjack.domain.Game.State;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Hand;

public class GameView {
    public nl.hu.bep2.casino.hetSpelBlackjack.domain.Game.State State;
    public Hand playerHand;
    public Hand dealerHand;

    public GameView(State State, Hand playerHand, Hand dealerHand) {
        this.State = State;
        this.playerHand = playerHand;
        this.dealerHand = dealerHand;
    }
}
