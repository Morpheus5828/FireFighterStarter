package com.firefighterstarter;

import com.firefighterstarter.controller.Controller;
import com.firefighterstarter.view.grid.Grid;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class FireFighterApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FireFighterApp.class.getResource("fire-fighter.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1500, 800);

        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}