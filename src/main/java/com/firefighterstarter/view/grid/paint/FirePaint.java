package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.layout.GridPane;

public class FirePaint extends GridColor {
    private int numberOfFire;

    public FirePaint(GridPane gridpane) {
        super(gridpane);
    }

    public void initPaint() {
        this.numberOfFire = 200;
        for(int i = 0; i < 200; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            // if square is cloud or way, don't paint a fire
            if(this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #706969;") ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #f3c9a2;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle(FIRE_COLOR);
        }
    }

    public int getNumberOfFire() {
        return numberOfFire;
    }
}

