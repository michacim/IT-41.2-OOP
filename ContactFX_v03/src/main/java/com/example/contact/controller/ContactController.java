package com.example.contact.controller;

import com.example.contact.model.Contact;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ContactController {

    // ------------------ FXML-Fields ---------------------------
    // TableView ---------------------------------------
    @FXML
    private TableView<Contact> tableView;
    @FXML
    private TableColumn<Contact, String> nameCol;
    @FXML
    private TableColumn<Contact, String> numberCol;
    @FXML
    private TableColumn<Contact, String> emailCol;
    //--------------------------------------------------

    @FXML
    private TextField nameField;
    @FXML
    private TextField numberField;
    @FXML
    private TextField emailField;





    @FXML
    void onDelete(ActionEvent event) {

    }

    @FXML
    void onSave(ActionEvent event) {

    }

    @FXML
    void initialize(){

    }

}
