package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public final String getPlayID() {
        return playID;
    }

    public final int getAudience() {
        return audience;
    }

    public final void setAudience(int audience) {
        this.audience = audience;
    }

    public final void setPlayID(String playID) {
        this.playID = playID;
    }
}
