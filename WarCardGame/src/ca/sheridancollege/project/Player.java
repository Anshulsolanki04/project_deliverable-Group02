package ca.sheridancollege.project;

/**
 * Abstract class representing a player.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void play();  // This must be present!
}
