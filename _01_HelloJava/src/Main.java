//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // start

        System.out.println("Hallo Java");

        Person p1 = new Person();// Person-Objet wird erzeugt -> Referenz

        p1.firstname ="Max";
        System.out.println(p1.firstname);
        System.out.println(p1.lastname);

        Person p2 = new Person();
        p2.firstname="Ina";
        System.out.println(p2.firstname);


        Person p3;// kein Objekt!!!


        // end
    }
}