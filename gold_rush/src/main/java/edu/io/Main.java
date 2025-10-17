package edu.io;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gold Rush");

        Board board = new Board();

        Token gold = new Token(Board.GOLD_TOKEN_LABEL);
        Token player = new Token(Board.PLAYER_TOKEN_LABEL);

        board.placeToken(5, 4, gold);
        board.placeToken(2, 3, player);

        board.display();
    }
}
