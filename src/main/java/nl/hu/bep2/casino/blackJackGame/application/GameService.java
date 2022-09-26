package nl.hu.bep2.casino.blackJackGame.application;

import nl.hu.bep2.casino.blackJackGame.data.BlackJackRepository;
import nl.hu.bep2.casino.blackJackGame.domain.Dealer;
import nl.hu.bep2.casino.blackJackGame.domain.Game;
import nl.hu.bep2.casino.blackJackGame.domain.Player;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Deck;
import nl.hu.bep2.casino.blackJackGame.domain.blackJackDeck.Hand;
import nl.hu.bep2.casino.blackJackGame.presentation.DeckFactory;
import nl.hu.bep2.casino.chips.application.Balance;
import nl.hu.bep2.casino.chips.application.ChipsService;

import nl.hu.bep2.casino.chips.domain.Chips;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class GameService {
    private final BlackJackRepository blackJackRepository;
    private String playerName;
    private Game game;
    private Dealer dealer;
    private Player player;
    private ChipsService chipsService;


    public GameService(BlackJackRepository blackJackRepository) {
        this.blackJackRepository = blackJackRepository;
    }


    public Game StartGame(String playerName, ChipsService chipsService) {
        System.out.println(game.getPlayer());
        this.chipsService = chipsService;
        this.playerName = playerName;

        DeckFactory h = new DeckFactory();
        Deck deck = h.getRandomDeck();

        Hand dealerHand = new Hand();

        dealerHand.addCard(deck.getEenCard());

        Dealer dealer = new Dealer(deck,dealerHand);


        Hand playerHand = new Hand();

        playerHand.addCard(dealer.getCard());
        playerHand.addCard(dealer.getCard());

        Player player = new Player(playerHand);

        Game game = new Game(player, dealer);

//        this.chipsService = chipsService;
//        this.playerName = playerName;
//        Hand playerCards = new Hand();
//        Hand dealerCards = new Hand();
//        player = new Player(playerCards);
//        dealer = new Dealer(dealerCards);
//        game = new Game(player, dealer);
       this.blackJackRepository.save(game);
        System.out.println(game.getPlayer());
        return this.showBalanceFor(game);
    }
    private Game showBalanceFor(Game game) {
        return new Game(
                game.getPlayer(),
                game.getDealer()

        );
    }
}
