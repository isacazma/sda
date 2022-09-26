package nl.hu.bep2.casino.blackJackGame.presentation;


import nl.hu.bep2.casino.blackJackGame.application.GameService;
import nl.hu.bep2.casino.blackJackGame.data.GameRepository;
import nl.hu.bep2.casino.blackJackGame.domain.Dealer;
import nl.hu.bep2.casino.blackJackGame.domain.Player;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Deck;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Hand;
import nl.hu.bep2.casino.blackJackGame.domain.factories.GameView;
import nl.hu.bep2.casino.chips.application.ChipsService;
import nl.hu.bep2.casino.blackJackGame.domain.Game;
import nl.hu.bep2.casino.security.domain.UserProfile;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {
    private final GameRepository gameRepository;
    private ChipsService service;
    private GameService gameService;

    public GameController(GameRepository gameRepository, ChipsService service, GameService gameService) {
        this.gameRepository = gameRepository;
        this.service = service;
        this.gameService = gameService;
    }
//    @PostMapping("/startgame")
//    public Game start(Authentication authentication) {
//        UserProfile profile = (UserProfile) authentication.getPrincipal();
//        Game dat = this.gameService.StartGame(profile.getUsername(), service);
//        System.out.println(dat);
//        return dat;
//    }

    @PostMapping("/startGame")
    public GameView start(Authentication authentication) {
        UserProfile profile = (UserProfile) authentication.getPrincipal();
        UserProfile profile = (UserProfile) authentication.getPrincipal();
       Game game = this.gameService.StartGame(profile.getUsername(), service);
//        DeckFactory h = new DeckFactory();
//        Deck deck = h.getRandomDeck();
//
//        Hand dealerHand = new Hand();
//
//        dealerHand.addCard(deck.getEenCard());
//
//        Dealer dealer = new Dealer(deck,dealerHand);
//
//
//        Hand playerHand = new Hand();
//
//        playerHand.addCard(dealer.getCard());
//        playerHand.addCard(dealer.getCard());
//
//        Player player = new Player(playerHand);
//
//        Game game = new Game(player, dealer);
////        this.gameRepository.save(game);
////        this.gameRepository.save(game);

//        System.out.println(game.getDealer()deck);
        System.out.println(game.getPlayer() + "dddd");
        System.out.println(dealer);
        System.out.println(game);

        return createGameView(game);

    }



    private GameView createGameView(Game game) {
        return new GameView(
        game.getState(),game.getPlayer().getHand(),game.getDealer().getHand());
    }
}
