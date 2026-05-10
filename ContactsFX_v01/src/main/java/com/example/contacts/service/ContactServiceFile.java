package com.example.contacts.service;



import com.example.contacts.io.FileHandler;
import com.example.contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceFile implements ContactService{
    /**
     *
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        FileHandler.writeContact(newContact);
        return true;
    }

    @Override
    public List<Contact> findAll() {
        return FileHandler.readContacts();
    }

    //--------------------------------------------------------------------
    /**
     *
     * @param id
     * @return true if deleted
     */
    @Override
    public boolean deleteById(int id) {

        //1. Liste holen : readContacts()
        //2. aus Liste löschen
        //3. Datei neu schreiben


        return false;
    }

    /**
     * check if id present
     *
     * @param contact
     * @return
     */
    @Override
    public boolean update(Contact contact) {
        //1. Liste holen : readContacts()
        //2. Liste (Contact) veränder/updaten
        //3. Datei neu schreiben
        return false;
    }

    /**
     *
     * @param name
     * @return List<Contact> - name is not unique!
     */
    @Override
    public List<Contact> findByName(String name) {
        ArrayList<Contact> result = new ArrayList<>();
        for (Contact c : findAll()){
//            if(c.getName().equalsIgnoreCase(name)){
//                result.add(c);
//            }
            if(c.getName().toLowerCase().contains(name.toLowerCase()))   {
                result.add(c);
            }
        }
        return result;
    }

    /**
     * System.out.print all Contacts
     */
    @Override
    public void printAll() {

    }

}
