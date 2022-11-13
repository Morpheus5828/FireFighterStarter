package com.firefighterstarter;

import com.firefighterstarter.view.grid.Grid;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FireFighterApp extends Application {
    @Override
    public void start(Stage stage) {

        Grid gridPaint = new Grid(1000, 1000, 1000, 1000);
        gridPaint.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");

        Scene scene = new Scene(gridPaint, 1000, 1000);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}