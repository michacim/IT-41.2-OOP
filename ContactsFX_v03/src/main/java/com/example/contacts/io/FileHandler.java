package com.example.contacts.io;



import com.example.contacts.FileCorruptedException;
import com.example.contacts.model.Contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    public static final String FILE_NAME = "contacts.txt";  //Konstante

    /**
     *
     * @param contact -new Contact(name,number,email)
     */
    public static void writeContact(Contact contact) {
        int nextId = getNextId();
        contact.setId(nextId);
        try {
            FileWriter fw = new FileWriter(FILE_NAME,true);// immer neue Zeile schreiben
            String line = String.format("%s,%s,%s,%s\n",
                    contact.getId(),
                    contact.getName(),
                    contact.getNumber(),
                    contact.getEmail()
            );

            fw.write(line);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<Contact> readContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();

        // check File is exists?
        File file = new File(FILE_NAME);
        if(!file.exists()){
            return contacts;
        }


        try {
            Scanner sc = new Scanner(new File(FILE_NAME));// out.txt
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] arr= line.split(",");
                System.out.println(arr.length);
                if(arr.length!=4){
                    throw new FileCorruptedException("Dateiformat nicht Korrekt!");
                }
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                String number =arr[2];
                String email =arr[3];

                // hier new Contact(id,name,number,email)
                Contact c = new Contact(id,name,number,email);
                // Contact zu ArrayList hinzufügen
                contacts.add(c);

             //   System.out.printf("%s %s %s %s\n",id, name,number,email );
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return contacts;
    }

    public static int getNextId(){
        List<Contact> contacts = readContacts();
        int maxId=0;
        for (Contact c:contacts){
            if(c.getId() > maxId){
                maxId = c.getId();
            }
        }
        return maxId + 1;
    }

    public static void writeContacts(List<Contact> allContacts) {
        try ( FileWriter fw =new FileWriter(FILE_NAME)){  //auto close/ ohne append(true)

            for(Contact contact:allContacts){
                String line = String.format("%s,%s,%s,%s\n",
                        contact.getId(),
                        contact.getName(),
                        contact.getNumber(),
                        contact.getEmail()
                );
                fw.write(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
