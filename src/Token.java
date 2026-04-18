public class Token {

    public static final int YELLOW = 1, RED = 2;
    private int colour;

    //Implementieren Sie einen Konstruktor mit einem Parameter zum Initialisieren der Instanzvariable
    public Token(int colour) {
        this.colour = colour;
    }

    int getColour() {
        return colour;
    }
}