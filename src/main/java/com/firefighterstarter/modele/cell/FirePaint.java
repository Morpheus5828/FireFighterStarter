package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

public class FirePaint extends Cell {
    private int numberOfFire;

    public FirePaint(GridPane gridpane) {
        super(gridpane);
    }

    public void initPaint() {
        this.numberOfFire = 200;
        for(int i = 0; i < 200; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            // if square is cloud or way, don't paint a fire
            if(this.gridPane.getChildren().get(randomSquare).getStyle().equals(WAY_COLOR) ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals(MOUNTAIN_COLOR) ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals(FF_COLOR) ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals(CLOUD_COLOR)
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle(FIRE_COLOR);
        }
    }

    public int getNumberOfFire() {
        return numberOfFire;
    }
}

