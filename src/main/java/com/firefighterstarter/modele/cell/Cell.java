package com.firefighterstarter.modele.cell;

import java.util.List;

public abstract class Cell {
    protected ColorType colorType;

    public ColorType getColor() {
        return this.colorType;
    };

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }
}
