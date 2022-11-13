package com.firefighterstarter;

import com.firefighterstarter.controller.Controller;
import com.firefighterstarter.view.grid.Grid;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class FireFighterApp extends Application {
    @Override
    public void start(Stage stage) {
        Pane layout = new Pane();
        layout.setPrefHeight(640.0);
        layout.setPrefWidth(1071.0);
        Grid grid = new Grid(1000, 1000, 1000, 1000);
        grid.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        grid.setLayoutX(194.0);
        grid.setLayoutY(1.0);
        grid.setPrefHeight(640.0);
        grid.setPrefWidth(878.0);
        Button play = new Button("Play");
        play.setLayoutX(50.0);
        play.setLayoutY(79.0);
        play.setPrefHeight(53.0);
        play.setPrefWidth(96.0);

        layout.getChildren().add(play);
        layout.getChildren().add(grid);

        Scene scene = new Scene(layout, 1500, 1000);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}