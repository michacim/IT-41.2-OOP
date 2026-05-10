import io.FileHandler;
import model.Contact;
import service.ContactService;
import service.ContactServiceDummy;
import service.ContactServiceFile;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contact c1 = new Contact("Max","17712345","max@web.de");
        Contact c2 = new Contact("Otto","24423","otto@web.de");
        Contact c3 = new Contact("Ina","12143423","ina@web.de");
        Contact c4 = new Contact("Ina","24423","i@web.de");

       // ContactService service = new ContactServiceDummy();
        ContactService service = new ContactServiceFile();
        service.save(c1);
        service.save(c2);
        service.save(c3);
        service.save(c4);

        System.out.println(service.findAll());//[Contact{name='Otto', number='24423', email='otto@web.de', id=2}, Contact{name='Ina', number='12143423', email='ina@web.de',
//        service.printAll();

//        System.out.println("delete...");
//        service.deleteById(c1.getId());
//        service.printAll();
//
//        System.out.println("findByName...");
//        List<Contact> findContacts = service.findByName("na"); //"Ina"
//        System.out.println(findContacts);
//
//        // Wie müsste ich diese Methode service.findByName("ina") verändern, dass auch Teil-Strings funktionieren?
//        // z.B. service.findByName("in") oder service.findByName("na") findet Ina
//
//
//
//        Contact c5 = new Contact("Mike","17724423","mike@web.de");
//        service.save(c5);
//        System.out.println("new Contact: "+c5);
//        service.update(new Contact(c5.getId(),"Mike","17711111","mike@gmail.de"));
//        //service.printAll();
//        System.out.println("update: "+c5);
//
//        System.out.println("findAll...");
//        System.out.println(service.findAll());

    }
}