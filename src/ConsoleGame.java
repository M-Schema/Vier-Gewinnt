import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleGame extends Game {

    public ConsoleGame(String namePlayer1, String namePlayer2) {
        super(namePlayer1, namePlayer2);
    }

    @Override
    public void play() throws GameException {
        int round = 0;
        int inputCol;
        Player currentPlayer = players[round % 2];
        Scanner scanner = new Scanner(System.in);

        while (!board.finished() && round < (board.ROWS * board.COLS)) {
            currentPlayer = players[round % 2];

            System.out.print("\n*********** \n"
                    + "Runde " + (round + 1)
                    + ". Spieler " + currentPlayer.getName()
                    + ", wählen Sie eine Spaltennummer (1-" + board.COLS + "): ");

            try {
                inputCol = Integer.parseInt(scanner.nextLine());
                board.drop(inputCol, currentPlayer);
                printBoard();

                round++;

            } catch (GameException e) {
                System.out.println("Ungültige Eingabe: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Bitte eine Zahl zwischen 1 und 7 eingeben.");
            } catch (InputMismatchException e) {
                throw new GameException("Falsche Eingabe!");
            }
        }

        if (board.finished()) {
            printWinner(currentPlayer);
        } else if (round >= (board.ROWS * board.COLS)) {
            printWinner(null);
        }
    }

    @Override
    public void printBoard() throws GameException {
        String divider = "  |  ";
        String boardHeader = "";

        System.out.println("Spielfeld: ");

        for (int i = 1; i <= board.COLS; i++) {
            boardHeader += "     " + i;
        }
        System.out.println(boardHeader);

        for (int i = 0; i < board.ROWS; i++) {
            for (int j = 0; j < board.COLS; j++) {

                System.out.print(divider);

                Token currentToken = board.getToken(i, j);
                if (currentToken == null) {
                    System.out.print(" ");
                } else if (currentToken.getColour() == Token.YELLOW) {
                    System.out.print("x");
                } else if (currentToken.getColour() == Token.RED) {
                    System.out.print("o");
                }
            }

            System.out.println(divider);
        }

        System.out.println(boardHeader); // as footer

    }

    @Override
    public void printWinner(Player player) {
        if (player != null) {
            System.out.println(player.getName() + " hat gewonnen!");
        } else {
            System.out.println("Unentschieden! Niemand hat gewonnen!");
        }

    }

}