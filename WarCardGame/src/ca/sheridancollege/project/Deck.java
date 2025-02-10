package ca.sheridancollege.project;

/**
 * Represents a standard 52-card deck.
 */
public class Deck extends GroupOfCards {
    public Deck() {
        super(52);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int rank = 2; rank <= 14; rank++) {
                cards.add(new PlayingCard(suit, rank));
            }
        }
        shuffle();
    }
}

