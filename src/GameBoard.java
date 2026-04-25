public class GameBoard {
    public static final int ROWS = 6, COLS = 7;
    private final Token[][] board;

    public GameBoard() {
        board = new Token[ROWS][COLS];
    }

    public Token getToken(int row, int col) throws GameException {
        try {
            return board[row][col];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new GameException("Ungültiger Index: Zeile " + row + ", Spalte " + col );
        }
    }

    public void drop(int inputCol, Player player) throws GameException {
        try {
            for (int i = ROWS; i >= 1; i--) {
                if (board[i - 1][inputCol - 1] == null) {
                    board[i - 1][inputCol - 1] = player.getToken();
                    return;
                }
            }
            throw new GameException("Spalte " + inputCol + " ist voll.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new GameException("Ungültige Spalte " + inputCol);
        }
    }

    public boolean finished() {
        Token token;

        // --- nach oben ---
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS; col++) {
                token = board[row][col];
                if (token != null
                        && board[row+1][col] != null && board[row+1][col].getColour() == token.getColour()
                        && board[row+2][col] != null && board[row+2][col].getColour() == token.getColour()
                        && board[row+3][col] != null && board[row+3][col].getColour() == token.getColour()) {
                    return true;
                }
            }
        }

        // --- nach rechts ---
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                token = board[row][col];
                if (token != null
                        && board[row][col+1] != null && board[row][col+1].getColour() == token.getColour()
                        && board[row][col+2] != null && board[row][col+2].getColour() == token.getColour()
                        && board[row][col+3] != null && board[row][col+3].getColour() == token.getColour()) {
                    return true;
                }
            }
        }

        // --- diagonal links-oben ---
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 3; col < COLS; col++) {
                token = board[row][col];
                if (token != null
                        && board[row+1][col-1] != null && board[row+1][col-1].getColour() == token.getColour()
                        && board[row+2][col-2] != null && board[row+2][col-2].getColour() == token.getColour()
                        && board[row+3][col-3] != null && board[row+3][col-3].getColour() == token.getColour()) {
                    return true;
                }
            }
        }

        // --- diagonal rechts-oben ---
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                token = board[row][col];
                if (token != null
                        && board[row+1][col+1] != null && board[row+1][col+1].getColour() == token.getColour()
                        && board[row+2][col+2] != null && board[row+2][col+2].getColour() == token.getColour()
                        && board[row+3][col+3] != null && board[row+3][col+3].getColour() == token.getColour()) {
                    return true;
                }
            }
        }

        return false;
    }

}