package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.layout.GridPane;

public class FireFighterPaint extends GridColor {

    public FireFighterPaint(GridPane gridPane) {
        super(gridPane);
    }

    public void initPaint() {
        for(int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 10);
            if(i != 0) {
                if(randomNumber % 5 == 0) {
                    if(this.gridPane.getChildren().get(i).getStyle().equals(WAY_COLOR))
                        this.gridPane.getChildren().get(i).setStyle(FF_COLOR);
                }
            }

        }
    }
}
