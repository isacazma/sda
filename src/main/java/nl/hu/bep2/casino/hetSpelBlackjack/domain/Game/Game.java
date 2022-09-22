package nl.hu.bep2.casino.hetSpelBlackjack.domain.Game;


import nl.hu.bep2.casino.hetSpelBlackjack.domain.Dealer;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Deck;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Player;
import nl.hu.bep2.casino.hetSpelBlackjack.presentation.dto.DepositGame;


public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;
    private DepositGame pot;
    private State state = State.STARTGAME;

    public Game(Deck pile, Player player, Dealer dealer, DepositGame pot) {
        this.deck = pile;
        this.player = player;
        this.dealer = dealer;

    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public DepositGame getPot() {
        return pot;
    }

    public void setPot(DepositGame pot) {
        this.pot = pot;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Game{" +
                "pile=" + deck +
                ", player='" + player + '\'' +
                ", dealer='" + dealer + '\'' +
                ", pot=" + pot +
                '}';
    }
}
