package com.firefighterstarter.view.grid;

import com.firefighterstarter.view.grid.paint.*;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class CellMouvementManager {
    private GridPane gridPane;
    private FirePaint firePaint;
    private CloudPaint cloudPaint;
    private FireFighterPaint fireFighterPaint;
    private WayPaint wayPaint;
    private MountainPaint mountainPaint;

    public CellMouvementManager(GridPane gridPane) {
        this.gridPane = gridPane;
        this.firePaint = new FirePaint(this.gridPane);
        this.cloudPaint = new CloudPaint(this.gridPane);
        this.wayPaint = new WayPaint(this.gridPane);
        this.mountainPaint = new MountainPaint(this.gridPane);
        this.fireFighterPaint = new FireFighterPaint(this.gridPane);
    }

    public void initGrid() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
        this.wayPaint.initPaint();
        this.mountainPaint.initPaint();
        this.fireFighterPaint.initPaint();
        this.cloudPaint.initPaint();
        this.firePaint.initPaint();
    }

    public void updateGrid() {
        this.cloudPaint.mouveCloud();
    }

    public void restartGrid() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
    }

    public int getNumberOfFire() {
        return this.firePaint.getNumberOfFire();
    }


}
