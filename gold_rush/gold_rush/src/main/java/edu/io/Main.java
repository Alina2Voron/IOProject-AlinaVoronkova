package edu.io;

public class Main {

    public static final String GOLD_TOKEN_LABEL = "\uD83D\uDCB0"; // 💰︎
    public static final String PLAYER_TOKEN_LABEL = "\uC6C3";

    public static void main(String[] args) {
        System.out.println("Gold Rush");
        Board board = new Board();

        // Tworzymy żetony (używamy symboli zdefiniowanych powyżej)
        Token gold = new Token(GOLD_TOKEN_LABEL);
        Token player = new Token(PLAYER_TOKEN_LABEL);

        // Umieszczamy żetony na planszy
        board.placeToken(5, 4, gold);
        board.placeToken(2, 3, player);

        // Wyświetlamy planszę
        board.display();
    }
}
