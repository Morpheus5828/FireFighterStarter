package com.firefighterstarter.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML private Button restart;


    @FXML
    protected void onHelloButtonClick() {
        restart.setText("");
    }
}