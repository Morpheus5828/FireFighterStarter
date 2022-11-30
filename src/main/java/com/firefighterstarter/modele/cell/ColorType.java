package com.firefighterstarter.modele.cell;

public enum ColorType {
    WAY, CLOUD, FIREFIGHTER, FIRE, MOUNTAIN, NOTHING, DOCTOR, INFECTED, NOINFECTED;

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
            case DOCTOR:
                return "-fx-background-color: #3bc9d8;";
            case INFECTED:
                return "-fx-background-color: #359f04;";
            case NOINFECTED:
                return "-fx-background-color: #727892;";

        }
        return "-fx-background-color: white;";
    }
}
