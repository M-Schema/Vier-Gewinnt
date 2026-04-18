public class Token {
    public static final int YELLOW = 1, RED = 2;
    private int colour;

    public Token(int colour) {
        this.colour = colour;

        System.out.println("Token");
    }

    public int getColour() {
        System.out.println("getColour");

        return colour;
    }
}