package nl.hu.bep2.casino.hetSpelBlackjack.presentation;


import nl.hu.bep2.casino.Factories.DeckFactory;
import nl.hu.bep2.casino.chips.application.Balance;
import nl.hu.bep2.casino.chips.application.ChipsService;
import nl.hu.bep2.casino.chips.domain.Chips;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Dealer;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Deck;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Game.Game;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Hand;
import nl.hu.bep2.casino.hetSpelBlackjack.domain.Player;
import nl.hu.bep2.casino.hetSpelBlackjack.presentation.dto.DepositGame;
import nl.hu.bep2.casino.hetSpelBlackjack.presentation.view.GameView;
import nl.hu.bep2.casino.security.domain.UserProfile;
import org.springframework.security.core.Authentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {
    private ChipsService service;

    @GetMapping("/startGame")
    public GameView startGame(Authentication authentication, DeckFactory deckFactory, @Validated @RequestBody DepositGame pot) {
        UserProfile profile = (UserProfile) authentication.getPrincipal();

        Deck deck = deckFactory.getRandomDeck();

        Hand dealerHand = new Hand();

        dealerHand.addCard(deck.getEenCard());

        Dealer dealer = new Dealer(deck,dealerHand);

        Balance balance = this.service.findBalance(profile.getUsername());

        Chips playerChips = new Chips(profile.getUsername(), balance.getChips());
        playerChips.withdraw(pot.betAmount);

        Hand playerHand = new Hand();

        playerHand.addCard(dealer.getCard());
        playerHand.addCard(dealer.getCard());

        Player player = new Player(playerHand);

        Game game = new Game(deck,player, dealer, pot);
        System.out.println(game);
        return createGameView(game);

    }

//    @PostMapping("/")

    private GameView createGameView(Game game) {
        return new GameView(
        game.getState(),game.getPlayer().getHand(),game.getDealer().getHand());
    }
}
