package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a deck or hand of cards.
 */
public class GroupOfCards {
    protected ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
