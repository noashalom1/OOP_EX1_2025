public class Position {
    private final int row;
    private final int col;

    /**
     * Constructor to initialize a position on the board.
     *
     * @param row the row of the position.
     * @param col the column of the position.
     */
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * @return the row of this position.
     */
    public int getRow() {
        return row;
    }

    /**
     * @return the column of this position.
     */
    public int getCol() {
        return col;
    }

    /**
     * Checks if this position is equal to another position.
     *
     * @param obj the other position to compare to.
     * @return true if both positions have the same row and column, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return row == position.row && col == position.col;
    }

    /**
     * Returns a string representation of the position.
     *
     * @return string in the format "(row, col)".
     */
    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }

}

