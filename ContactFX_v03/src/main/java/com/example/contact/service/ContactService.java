package com.example.contact.service;



import com.example.contacts.model.Contact;

import java.util.List;

public interface ContactService {

    /**
     *
     * @param newContact
     * @return true if saved
     */
    boolean save (Contact newContact);

    /**
     *
     * @param id
     * @return true if deleted
     */
    boolean deleteById(int id);

    /**
     * check if id present
     * @param contact
     * @return
     */
    boolean update( Contact contact);


    /**
     *
     * @param name
     * @return List<Contact> - name is not unique!
     */
    List<Contact> findByName(String name);

    /**
     * System.out.print all Contacts
     */
    void printAll();

    List<Contact> findAll();
}
