import java.util.List;

public class Move {
    private final Position position;
    private final Disc disc;
    private final List<Disc> flippedDiscs;

    /**
     * Constructor to initialize a move on the board.
     *
     * @param position the position on the board where the disc was placed.
     * @param disc the disc that was placed.
     * @param flippedDiscs the list of discs that were flipped as a result of this move.
     */
    public Move(Position position, Disc disc, List<Disc> flippedDiscs) {
        this.position = position;
        this.disc = disc;
        this.flippedDiscs = flippedDiscs;
    }

    /**
     * @return the position of this move.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @return the disc placed in this move.
     */
    public Disc getDisc() {
        return disc;
    }

    @Override
    public String toString() {
        return "Move{" +
                "position=" + position +
                ", disc=" + disc +
                ", flippedDiscs=" + flippedDiscs +
                '}';
    }
}
