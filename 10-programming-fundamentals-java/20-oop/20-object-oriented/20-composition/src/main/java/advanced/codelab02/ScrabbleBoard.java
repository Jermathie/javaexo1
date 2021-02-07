package advanced.codelab02;

public class ScrabbleBoard {

    private Square[][] board = new Square[15][15];

    public ScrabbleBoard() {
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = new Square();
            }
        }
    }

    public Square getSquareAt(int x, int y) {
        return board[y][x];
    }

    @Override
    public String toString() {
        String result = "";
        for (Square[] row : board) {
            for (Square square : row) {
                result += square;
            }
            result += "\n";
        }
        return result;
    }
}
