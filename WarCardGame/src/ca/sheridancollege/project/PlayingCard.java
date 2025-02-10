package ca.sheridancollege.project;

public class PlayingCard extends Card {
    private String suit;
    private int rank;

    public PlayingCard(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
