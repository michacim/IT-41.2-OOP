package service;

import io.FileHandler;
import model.Contact;

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
        return List.of();
    }

    /**
     * System.out.print all Contacts
     */
    @Override
    public void printAll() {

    }

}
