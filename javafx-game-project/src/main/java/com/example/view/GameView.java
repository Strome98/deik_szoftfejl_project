package com.example.view;

import com.example.controller.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GameView extends Application {
    private final GameController controller;

    public GameView() {
        this.controller = new GameController(new com.example.model.GameModel());
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        // Add buttons or labels to represent the board

        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Knight Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}