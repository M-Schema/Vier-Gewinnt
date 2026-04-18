public class GameException extends Exception {

    public GameException(String e) {
        super(e);

        System.out.println("super GameException");
    }
}