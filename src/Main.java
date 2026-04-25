import java.util.Scanner;

public class Main {

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