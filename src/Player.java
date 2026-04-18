public class Player {
    private String namePlayer;
    private Token token;

    public Player(String namePlayer, Token token) {
        this.namePlayer = namePlayer;
        this.token = token;

        System.out.println("player");
    }

    public String getName() {
        System.out.println("getName");

        return namePlayer;
    }

    public Token getToken() {
        System.out.println("getToken");

        return token;
    }

}