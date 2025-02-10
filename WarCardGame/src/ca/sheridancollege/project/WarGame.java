package ca.sheridancollege.project;
import java.util.Scanner;


/**
 * Implements the War card game logic.
 */
public class WarGame extends Game {
    private WarPlayer player1;
    private WarPlayer player2;
    private Deck deck;
    private Scanner scanner;
    

    public WarGame(String name, WarPlayer player1, WarPlayer player2) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
        this.scanner = new Scanner(System.in);

    }

    @Override
public void play() {
    distributeCards();
    while (!player1.getHand().getCards().isEmpty() && !player2.getHand().getCards().isEmpty()) {
        System.out.println("Press Enter to play the next round...");
        scanner.nextLine(); // Wait for user input

        PlayingCard card1 = (PlayingCard) player1.getHand().getCards().remove(0);
        PlayingCard card2 = (PlayingCard) player2.getHand().getCards().remove(0);

        System.out.println(player1.getName() + " plays " + card1);
        System.out.println(player2.getName() + " plays " + card2);
        System.out.println(player1.getName() + " has " + player1.getHand().getCards().size() + " cards remaining.");
        System.out.println(player2.getName() + " has " + player2.getHand().getCards().size() + " cards remaining.\n");


        if (card1.getRank() > card2.getRank()) {
            player1.getHand().getCards().add(card1);
            player1.getHand().getCards().add(card2);
            System.out.println(player1.getName() + " wins this round!\n");
        } else if (card2.getRank() > card1.getRank()) {
            player2.getHand().getCards().add(card1);
            player2.getHand().getCards().add(card2);
            System.out.println(player2.getName() + " wins this round!\n");
        } else {
            System.out.println("It's a tie!\n");
        }
    }
    declareWinner();
}


    private void distributeCards() {
        for (int i = 0; i < deck.getCards().size(); i++) {
            if (i % 2 == 0) {
                player1.getHand().getCards().add(deck.getCards().get(i));
            } else {
                player2.getHand().getCards().add(deck.getCards().get(i));
            }
        }
    }

    @Override
    public void declareWinner() {
        if (player1.getHand().getCards().size() > player2.getHand().getCards().size()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getHand().getCards().size() > player1.getHand().getCards().size()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

