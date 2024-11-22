import java.util.List;

public class GameLogic implements PlayableLogic {
    private final int boardSize = 8;
    private Disc[][] board = new Disc[boardSize][boardSize];

    private Player FirstPlayer;
    private Player SecondPlayer;

    @Override
    public boolean locate_disc(Position a, Disc disc) {
        if (board[a.getRow()][a.getCol()] != null) {
            return false;
        }
        board[a.getRow()][a.getCol()] = disc;//locate disc on board

        return false;
    }

    @Override
    public Disc getDiscAtPosition(Position position) {

        return board[position.getRow()][position.getCol()];
    }

    @Override
    public int getBoardSize() {
        return boardSize;
    }

    @Override
    public List<Position> ValidMoves() {
        return List.of();
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return FirstPlayer;
    }

    @Override
    public Player getSecondPlayer() {
        return SecondPlayer;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {
        FirstPlayer = player1;
        SecondPlayer = player2;

    }

    @Override
    public boolean isFirstPlayerTurn() {
        return false;
    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void undoLastMove() {

    }
}
