package com.example;

import com.example.model.GameModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameModelTest {
    @Test
    void testValidMove() {
        GameModel model = new GameModel();
        assertTrue(model.moveKnight(0, 0, 2, 1)); // Valid knight move
    }

    @Test
    void testInvalidMove() {
        GameModel model = new GameModel();
        assertFalse(model.moveKnight(0, 0, 3, 3)); // Invalid knight move
    }
}