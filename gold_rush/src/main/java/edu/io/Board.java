package edu.io;

public class Board {
    public int size = 8;
    private Token[][] grid;

    public static final String EMPTY_TOKEN_LABEL = "\u30FB";
    public static final String GOLD_TOKEN_LABEL = "\uD83D\uDCB0";
    public static final String PLAYER_TOKEN_LABEL = "\uC6C3";

    public Board() {
        grid = new Token[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = new Token(EMPTY_TOKEN_LABEL);
            }
        }
    }

    public void clean() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = new Token(EMPTY_TOKEN_LABEL);
            }
        }
    }

    public void placeToken(int x, int y, Token token) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            grid[y][x] = token;
        }
    }

    public Token square(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return grid[y][x];
        }return null;
    }

    public void display() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(grid[row][col] + " ");
            }System.out.println();
        }
    }

}
