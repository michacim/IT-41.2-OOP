package com.example._10_fxtableview;

import com.example._10_fxtableview.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {


    // ---------------- FXML Fields -----------------------------
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;

    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> idCol;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> emailCol;
    // -----------------------------------------------------------





    @FXML
    void onSave(ActionEvent event) {

        tableView.getItems().add(new Person(nameField.getText(),emailField.getText()));

    }
    @FXML
    void initialize(){
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));//getId()
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));//getName()
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));//getEmail()


        tableView.getItems().add(new Person("Max","max@web.de"));
        tableView.getItems().add(new Person("Ina","ina@web.de"));
        tableView.getItems().add(new Person("Paul","paul@web.de"));


        //------------ ContextMenu ---------
//        ContextMenu cm = new ContextMenu();
//        MenuItem deleteItem = new MenuItem("Delete");
//        cm.getItems().add(deleteItem);
//        tableView.setContextMenu(cm);
//        deleteItem.setOnAction(event -> {
//           Person deletedPerson =  tableView.getSelectionModel().getSelectedItem();
//           tableView.getItems().remove(deletedPerson);
//        });

    }

    public void onDelete(ActionEvent actionEvent) {
        Person deletedPerson = tableView.getSelectionModel().getSelectedItem();
        tableView.getItems().remove(deletedPerson);
    }
}
