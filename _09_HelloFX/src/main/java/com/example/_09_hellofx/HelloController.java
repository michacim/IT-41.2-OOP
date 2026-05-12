package com.example._09_hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import javax.swing.*;

public class HelloController {

    @FXML
    private TextField inputField;

    @FXML
    private Label outputLabel;

    @FXML
    void onWrite(ActionEvent event) {
        Button b = (Button) event.getSource();

        outputLabel.setText(inputField.getText());
        b.setDisable(true);
    }

    @FXML
    void onDelete(ActionEvent actionEvent) {
        inputField.clear();
        outputLabel.setText("");
    }

    @FXML
    void onChange(KeyEvent keyEvent) {
        System.out.println(inputField.getText());
    }

    @FXML
    void initialize() {  // wird nach Controller-Objekt-Erzeugung automatisch aufgerufen
        inputField.setText("Text...");

    }
}
