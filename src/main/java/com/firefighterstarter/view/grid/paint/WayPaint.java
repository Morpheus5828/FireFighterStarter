package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.layout.GridPane;

public class WayPaint extends GridColor {

    public WayPaint(GridPane gridPane) {
        super(gridPane);
        initPaint();
    }

    public void initPaint() {
        for(int i = 0; i < 5; i++)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 37; i < 400; i += 33)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 400; i < 415; i++)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i =415; i < 800; i += 33)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
    }
}
