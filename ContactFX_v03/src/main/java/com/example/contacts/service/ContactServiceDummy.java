package com.example.contacts.service;



import com.example.contacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceDummy implements ContactService{

    private List<Contact> contacts = new ArrayList<>();
    public static int count = 0;
    /**
     *
     * @param newContact
     * @return true if saved
     */
    @Override
    public boolean save(Contact newContact) {
        if(newContact==null){
            return false;
        }
        if(newContact.getId()>0){
            System.out.println("neuer Contact ohne id");
            return false;
        }
        int id = ++count;
        newContact.setId(id);
        contacts.add(newContact);
        return true;
    }

    /**
     *
     * @param id
     * @return true if deleted
     */
    @Override
    public boolean deleteById(int id) {
        return contacts.removeIf(c ->  c.getId()==id);//Lambda-Ausdruck
    }

    /**
     * check if id present
     *
     * @param contact with id
     * @return
     */
    @Override
    public boolean update(Contact contact) {
        if(contact==null){
            return false;
        }
        if(contact.getId() <=0){ // Contact  muss für ine update eine gültige id (> 0) haben
            return false;
        }

        for (Contact existing:contacts) {
            if(existing.getId()== contact.getId()){
                existing.setName(contact.getName());
                existing.setNumber(contact.getNumber());
                existing.setEmail(contact.getEmail());
                return true;
            }

        }


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
        for (Contact c : contacts){
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

        System.out.println(contacts);
    }

    @Override
    public List<Contact> findAll() {
        //ArrayList<Contact> result =  new ArrayList<>();

        return contacts;
    }
}
