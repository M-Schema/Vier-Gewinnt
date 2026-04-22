public class Player {
    private String namePlayer;
    private Token token;

    public Player(String namePlayer, Token token) {
        this.namePlayer = namePlayer;
        this.token = token;
    }

    public String getName() {
        return namePlayer;
    }

    public Token getToken() {
        return token;
    }

}