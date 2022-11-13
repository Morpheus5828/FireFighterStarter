package com.firefighterstarter.view.grid.paint;

import javafx.scene.layout.GridPane;

public class FireFighterPaint {
    private GridPane gridPane;

    public FireFighterPaint(GridPane gridPane) {
        this.gridPane = gridPane;

        paint();
    }

    private void paint() {
        for(int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 10);
            if(i != 0) {
                if(randomNumber % 5 == 0) {
                    if(this.gridPane.getChildren().get(i).getStyle().equals("-fx-background-color: #a5632a;"))
                        this.gridPane.getChildren().get(i).setStyle("-fx-background-color: black;");
                }
            }

        }
    }
}
