package com.gestor;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField nomeField;

    @FXML
    private void salvar() {
        System.out.println("Nome digitado: " + nomeField.getText());
    }
}
