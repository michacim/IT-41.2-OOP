package com.example.contacts.controller;

import com.example.contacts.model.Contact;
import com.example.contacts.service.ContactService;
import com.example.contacts.service.ContactServiceFile;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

public class ContactController {
    //---------------- Custom Fields --------------------------

    private ContactService service = new ContactServiceFile();

    @FXML
    private TextField searchField;
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
    void onSearch(ActionEvent actionEvent) {
    }
    @FXML
    void initialize(){
        System.out.println("inti Controller");
        List<Contact> persons = service.findAll();
        System.out.println(persons);
        //tableView.setItems(FXCollections.observableArrayList(persons));//ArrayList zu ObservableList
        tableView.getItems().setAll(persons);

    }

}
