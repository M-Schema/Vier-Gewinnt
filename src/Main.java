import java.util.Scanner;

public class Main {

    /**
     *
     * @param args
     * @throws GameException
     */

    /* ToDo
# GameBoard.finished()
  Ziel des Spiels ist es, vier Steine der gleichen Farbe
  in einer Zeile, einer Spalte oder diagonal anzuordnen

# refactoring
- catch in play() Fangen Sie dabei die Exceptions, die durch eine falsche Eingabe entstehen,
auf und wiederholen Sie in diesem Fall die Konsoleneingabe.
- "Ist der Parameter null, dann endet das Spiel unentschieden." in printWinner()
- horizontalDivider & boardHeader in printBoard()
     */

    public static void main(String[] args) throws GameException {
        Scanner scanInput = new Scanner(System.in);
        String namePlayer1;
        String namePlayer2;

        System.out.print("Name Spieler 1: ");
        namePlayer1 = scanInput.nextLine();
        System.out.print("Name Spieler 2: ");
        namePlayer2 =  scanInput.nextLine();

        ConsoleGame game = new ConsoleGame(namePlayer1, namePlayer2);
        game.play();

        System.out.print("Spiel beendet!");
    }
}