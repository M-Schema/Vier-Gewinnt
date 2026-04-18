public class GameBoard {
    public static final int ROWS = 6, COLS = 7;
    private final Token[][] board;

    public GameBoard() {
        board = new Token[ROWS][COLS];

        System.out.println("board");
    }

    public Token getToken(int row, int col) throws GameException {
        try {
            System.out.println("getToken");

            return board[row - 1][col - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new GameException("Ungültiger Index: Zeile " + row + ", Spalte " + col);
        }
    }

    public void drop(int col, Player player) throws GameException {
        try {
            System.out.println("drop");

            for (int row = ROWS; row >= 1; row--) {
                if (board[row - 1][col - 1] == null) {
                    board[row - 1][col - 1] = player.getToken();
                    return;
                }
            }
            throw new GameException("Spalte " + col + " ist voll.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new GameException("Ungültige Spalte " + col);
        }
    }

    public boolean finished() {
//Die Methode finished hat keine Parameter und einen Rückgabewert vom Typ boolean.
//Sie überprüft, ob eine Spielerin oder ein Spieler das Spiel gewonnen hat,
//und gibt in diesem Fall den Wert true zurück. Durchlaufen Sie dazu alle Zeilen und Spalten
//des Feldes und prüfen Sie für jede Position, ob die folgenden drei Felder die gleiche
//Farbe haben wie das aktuelle Feld. Sie müssen dazu vier Richtungen nach oben, nach rechts,
//diagonal nach links-oben und diagonal nach rechts-oben untersuchen.


        System.out.println("finished");
        return false; //mock
    }

}