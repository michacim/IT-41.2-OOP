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
        List<Contact> allContacts = findAll();
        boolean deleted = allContacts.removeIf(contact -> contact.getId() == id);
        if(deleted){
            FileHandler.writeContacts(allContacts);
            return true;
        }


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
        //1. Liste holen : findAll()
        //2. Liste (Contact) verändern/updaten
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
        //not impl
    }

    public static void main(String[] args) {
        ContactServiceFile service = new ContactServiceFile();
        //5,Ina,23324234,ina@web.de
        service.update(new Contact(5,"Ina","11111111","ina@web.de"));

    }

}
