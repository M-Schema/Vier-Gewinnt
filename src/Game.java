abstract class Game {
    protected Player[] players;
    protected GameBoard board;

    public Game(String namePlayer1, String namePlayer2) {
        players = new Player[2];
        players[0] = new Player(namePlayer1, new Token(Token.YELLOW));
        players[1] = new Player(namePlayer2, new Token(Token.RED));
        board = new GameBoard();

        System.out.println("abstract Game");
    }

    public abstract void play();

    public abstract void printBoard() throws GameException;

    public abstract void printWinner(Player player);

}