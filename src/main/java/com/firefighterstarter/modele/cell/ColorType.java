package com.firefighterstarter.modele.cell;

public enum ColorType {
    WAY, CLOUD, FIREFIGHTER, FIRE, MOUNTAIN, NOTHING;

    public String getBackgroundColor(ColorType colorType) {
        switch (colorType) {
            case WAY:
                return "-fx-background-color: #a5632a;";
            case CLOUD:
                return "-fx-background-color: #706969;";
            case FIRE:
                return "-fx-background-color: red;";
            case FIREFIGHTER:
                return "-fx-background-color: black;";
            case MOUNTAIN:
                return "-fx-background-color: f3c9a2;";
            case NOTHING:
                return "-fx-background-color: white;";
        }
        return "-fx-background-color: white;";
    }
}
