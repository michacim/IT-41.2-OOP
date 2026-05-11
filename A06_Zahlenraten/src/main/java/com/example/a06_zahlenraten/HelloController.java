package com.example.a06_zahlenraten;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField callNumberField;

    @FXML
    private TextField listSizeField;

    @FXML
    private Label resultLabel;

    @FXML
    void onCall(ActionEvent event) {
     //Result

        /*
        Zufallszahl == callNumber: Treffer
        Zufallszahl < callNumber: Zahl zu klein
        Zufallszahl > callNumber: Zahl zu groß
         */

    }

    @FXML
    void onCreate(ActionEvent event) {
        // NumberService.createNumberList();
        //NumberService.randomNumber()
    }

}
