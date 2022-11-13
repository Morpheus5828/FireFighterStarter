package com.firefighterstarter.view.grid.paint;

import javafx.scene.layout.GridPane;

public class MountainPaint {
    private GridPane gridPane;

    public MountainPaint(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public void paint() {
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
