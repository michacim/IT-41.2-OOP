package com.example.contacts;

import com.example.contacts.model.Contact;
import com.example.contacts.service.ContactService;
import com.example.contacts.service.ContactServiceFile;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ApplicationView extends Application {

   //private ContactService service = new ContactServiceDummy();
    private ContactService service = new ContactServiceFile();
    private ListView<Contact> listView = new ListView<>();
    @Override
    public void start(Stage stage) throws IOException {
        initContacts();
        TextField nameField = new TextField();//Controlls
        nameField.setPromptText("Name");

        TextField numberField = new TextField();
        numberField.setPromptText("Number");

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        TextField searchField = new TextField();
        searchField.setPromptText("Search");

        Button saveButton = new Button("Save");

        saveButton.setOnAction(event -> {
            System.out.println("Save...");
            Contact contact = new Contact(nameField.getText(), numberField.getText(),emailField.getText());
            service.save(contact);

            listView.getItems().setAll(service.findAll());// refresh ListView
        });
        VBox root = new VBox(10,nameField,numberField,emailField,saveButton,listView,searchField); // Container

        //Search-Event-----------------------------------
        searchField.setOnKeyTyped(event -> {
            System.out.println(searchField.getText());
            List<Contact> findContacts =  service.findByName(searchField.getText());
            listView.getItems().setAll(findContacts);

        });
        root.setPadding(new Insets(15));

        Scene scene = new Scene(root,400,300);
        stage.setTitle("Kontakte");
        stage.setScene(scene);
        stage.show();

    }

    private void initContacts(){
        listView.getItems().setAll(service.findAll());
        onDelete();

    }

    private void onDelete(){
        ContextMenu cm = new ContextMenu();
        MenuItem deleteItem = new MenuItem("Delete");
        cm.getItems().add(deleteItem);

        listView.setContextMenu(cm);

        deleteItem.setOnAction(event -> {
             Contact deleteContact=  listView.getSelectionModel().getSelectedItem();
            System.out.println("Delete Contact: "+deleteContact.toStringAll());
             service.deleteById(deleteContact.getId());
             listView.getItems().setAll(service.findAll());//refresh
        });

    }
}
