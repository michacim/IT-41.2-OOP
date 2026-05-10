import phonebook.Phonebook;
import phonebook.PhonebookImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Test der Phonebook-Methoden
        // Geeignete Ausgabe mit System.println...
        PhonebookImpl phonebook =new PhonebookImpl();
        boolean  saved = phonebook.save("Max","123456");
        System.out.println("saved: "+saved);
        if(saved){
            System.out.println("Eintrag gespeichert");
        }
        phonebook.save("Otto","1234341241");
        phonebook.printAll();
        System.out.println("Save doppelteer Key");
        phonebook.save("Otto","1234341241");
        phonebook.printAll();

        System.out.println("delete Max");
        phonebook.delete("Max");
        phonebook.printAll();


    }
}