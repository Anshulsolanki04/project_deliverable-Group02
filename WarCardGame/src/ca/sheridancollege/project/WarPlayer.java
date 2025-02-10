package ca.sheridancollege.project;

/**
 * Represents a player in the War card game.
 */
public class WarPlayer extends Player {
    private Hand hand;

    public WarPlayer(String name) {
        super(name);
        hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {  // Ensure this method is present
        System.out.println(getName() + " plays a card!");
    }
}

