package ca.sheridancollege.project;

import ca.sheridancollege.project;
import ca.sheridancollege.project.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class DeckTest {

    @Test
    public void testDeckSize() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCards().size(), "Deck should contain 52 cards.");
    }

    @Test
    public void testDeckShuffling() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();

        HashSet<Card> set1 = new HashSet<>(deck1.getCards());
        HashSet<Card> set2 = new HashSet<>(deck2.getCards());

        assertEquals(set1, set2, "Deck should always contain the same unique cards.");
        assertNotEquals(deck1.getCards(), deck2.getCards(), "Shuffled decks should not have the same order.");
    }
}
