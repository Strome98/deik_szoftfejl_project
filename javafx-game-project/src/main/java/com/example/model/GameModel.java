package com.example.model;

public class GameModel {
    private final int BOARD_SIZE = 10;
    private final char[][] board;
    private int currentPlayer; // 0 for dark, 1 for light

    public GameModel() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '.'; // Empty cell
            }
        }
        currentPlayer = 0; // Dark starts
    }

    public boolean moveKnight(int fromX, int fromY, int toX, int toY) {
        if (isValidMove(fromX, fromY, toX, toY)) {
            board[fromX][fromY] = currentPlayer == 0 ? 'D' : 'L'; // Mark the cell
            currentPlayer = 1 - currentPlayer; // Switch player
            return true;
        }
        return false;
    }

    private boolean isValidMove(int fromX, int fromY, int toX, int toY) {
        int dx = Math.abs(fromX - toX);
        int dy = Math.abs(fromY - toY);
        return dx * dy == 2 && board[toX][toY] == '.'; // Knight move and empty target
    }

    public boolean checkWin() {
        // Implement win condition logic (5 consecutive marks)
        return false;
    }

    public char[][] getBoard() {
        return board;
    }
}