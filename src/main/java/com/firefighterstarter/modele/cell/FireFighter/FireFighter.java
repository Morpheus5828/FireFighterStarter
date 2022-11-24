package com.firefighterstarter.modele.cell.FireFighter;

import java.util.ArrayList;
import java.util.List;

public class FireFighter {
    private int position;
    private List<Integer> fires;
    private List<String> fireRoad;

    public FireFighter(int ffPosition) {
        this.position = ffPosition;
        this.fires = new ArrayList<>();
        this.fireRoad = new ArrayList<>();
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Integer> getFires() {
        return fires;
    }

    public void addElement(int fire) {
        this.fires.add(fire);
    }

    public boolean contains(int fire) {
        return this.fires.contains(fire);
    }

    public void removeAllFires() {
        this.fires = new ArrayList<>();
    }
}
