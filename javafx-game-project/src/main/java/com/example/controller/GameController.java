package com.example.controller;

import com.example.model.GameModel;

public class GameController {
    private final GameModel model;

    public GameController(GameModel model) {
        this.model = model;
    }

    public boolean handleMove(int fromX, int fromY, int toX, int toY) {
        return model.moveKnight(fromX, fromY, toX, toY);
    }

    public char[][] getBoardState() {
        return model.getBoard();
    }

    public boolean checkWin() {
        return model.checkWin();
    }
}