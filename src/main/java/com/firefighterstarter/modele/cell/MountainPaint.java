package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

public class MountainPaint extends Cell {

    public MountainPaint(GridPane gridPane) {
        super(gridPane);
    }

    public void initPaint() {
        for(int i = 0; i < 10; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            if(
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                            this.gridPane.getChildren().get(randomSquare+1).getStyle().equals("-fx-background-color: #a5632a;") ||
                            this.gridPane.getChildren().get(randomSquare+33).getStyle().equals("-fx-background-color: #a5632a;") ||
                            this.gridPane.getChildren().get(randomSquare+34).getStyle().equals("-fx-background-color: #a5632a;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+1).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+33).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+34).setStyle("-fx-background-color: #f3c9a2;");
        }
    }
}
