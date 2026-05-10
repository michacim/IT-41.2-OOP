//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("KN0001","Max","Meier");

        System.out.println(c1);

        c1.setFirstname("Otto");
        System.out.println(c1);



        Person person = new Customer("KN00002","Ina","Müller");


        person.info();




    }
}