package com.firefighterstarter.view.grid.paint;

import javafx.scene.layout.GridPane;

public class CloudPaint {
    private GridPane gridPane;

    public CloudPaint(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public void paint() {
        for(int i = 0; i < 50; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            if(this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                    this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #f3c9a2;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle("-fx-background-color: #706969;");
        }
    }
}
