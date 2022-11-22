package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class FireFighterPaint extends Cell implements Runnable{
    private List<Integer> fireFighterPosition;
    public FireFighterPaint(GridPane gridPane) {
        super(gridPane);
        this.fireFighterPosition = new ArrayList<>();
    }

    public void initPaint() {
        for(int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 10);
            if(i != 0) {
                if(randomNumber % 5 == 0) {
                    if(this.gridPane.getChildren().get(i).getStyle().equals(WAY_COLOR)) {
                        this.gridPane.getChildren().get(i).setStyle(FF_COLOR);
                        this.fireFighterPosition.add(randomNumber);
                    }
                }
            }
        }
    }

    public void run() {
        List<Integer> newList = new ArrayList<>();
        for(int fireFighterPosition : this.fireFighterPosition) {
            List<Integer> firePositonList = getFireNearFireFighter(fireFighterPosition);
            if(firePositonList.size() != 0) {
                int randomCell = (int) (Math.random() * firePositonList.size());
                switchFireFighterPosition(fireFighterPosition, randomCell);
                newList.add(fireFighterPosition);
            }
            else {
                newList.add(fireFighterPosition);
            }
        }
        this.fireFighterPosition = newList;
    }

    private void switchFireFighterPosition(int position, int randomCell) {
        this.gridPane.getChildren().get(position).setStyle(WHITE_COLOR);
        this.gridPane.getChildren().get(randomCell).setStyle(FF_COLOR);
    }

    private List<Integer> getFireNearFireFighter(int fireFighterPosition) {
        //TODO cadriller la zone +1 -1 +33 -33
        return null;
    }
}