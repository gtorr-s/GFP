package com.gestor.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField nomeField;


    @FXML
    private void salvarTransacao() {
        System.out.println("Nome digitado: " + nomeField.getText());

    }
}
