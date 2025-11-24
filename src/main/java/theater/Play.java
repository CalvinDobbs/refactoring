package theater;

/**
 * Represents a play with a name and type.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Creates a new Play.
     * @param name the name of the play (can be null)
     * @param type the type of the play (can be null)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the play.
     * @return the name of the play
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the play.
     * @return the type of the play
     */
    public String getType() {
        return type;
    }
}
