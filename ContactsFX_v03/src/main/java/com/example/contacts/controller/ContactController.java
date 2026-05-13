package com.example.contacts.controller;

import com.example.contacts.model.Contact;
import com.example.contacts.service.ContactService;
import com.example.contacts.service.ContactServiceFile;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

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
        Contact deleteContact = tableView.getSelectionModel().getSelectedItem();
        System.out.println("onDelete: "+deleteContact);

        boolean deleted = service.deleteById(deleteContact.getId());
        if (deleted) {
            tableView.getItems().setAll(service.findAll()); //refresh
            // tableView.getItems().remove(deleteContact);
        }
    }

    @FXML
    void onSave(ActionEvent event) {
        String name  = nameField.getText().trim();
        String number= numberField.getText().trim();
        String email = emailField.getText().trim();

        if(name.isEmpty() || number.isEmpty() || email.isEmpty()){
            System.out.println("Alle Felder ausfüllen");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Fehlerhafte Eingabe");
            alert.setContentText("Bitte alle Felder ausfüllen!");
            alert.showAndWait();
            return;
        }

        Contact newContact = new Contact(name,number,email);
        System.out.println("onSave: " + newContact);
        boolean saved = service.save(newContact);
        if (saved) {
            tableView.getItems().setAll(service.findAll()); //refresh
            nameField.clear();
            numberField.clear();
            emailField.clear();
        }

    }

    @FXML
    void onSearch(KeyEvent actionEvent) {
        System.out.println("onSearch...");
        List<Contact> findList=  service.findByName(searchField.getText());
        tableView.getItems().setAll(findList);
    }

    @FXML
    void initialize() {
        System.out.println("inti Controller");
        try {
            nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));//geName
            numberCol.setCellValueFactory(new PropertyValueFactory<>("number"));
            emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));


            //tableView.setItems(FXCollections.observableArrayList(persons));//ArrayList zu ObservableList
            tableView.getItems().setAll(service.findAll()); //refresh
        } catch (Exception e) {
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText(e.getMessage());
           alert.setContentText("Bitte Datei korrigieren und Programm neu starten!");
           alert.showAndWait();
           Platform.exit();
        }

    }

}
