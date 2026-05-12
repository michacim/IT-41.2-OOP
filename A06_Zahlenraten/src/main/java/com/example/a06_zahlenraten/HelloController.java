package com.example.a06_zahlenraten;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class HelloController {

    @FXML
    private TextField callNumberField;

    @FXML
    private TextField listSizeField;

    @FXML
    private Label resultLabel;

    private int randomNumber;

    @FXML
    void onCall(ActionEvent event) {

        int callNumber = Integer.parseInt(callNumberField.getText());
        if(randomNumber == callNumber){
            resultLabel.setText("Gewonnen");
        } else if (randomNumber > callNumber) {
            resultLabel.setText("Zahl zu kleine");
        } else {
            resultLabel.setText("Zahl zu groß");
        }


    }

    @FXML
    void onCreate(ActionEvent event) {
        System.out.println("onCreate..");
        // NumberService.createNumberList();
        //NumberService.randomNumber()
        int[] numbers=  NumberService.createNumberList(Integer.parseInt(listSizeField.getText()));

        System.out.println(Arrays.toString(numbers));
        randomNumber = NumberService.randomNumber(numbers);
        System.out.println(randomNumber);

    }

}
