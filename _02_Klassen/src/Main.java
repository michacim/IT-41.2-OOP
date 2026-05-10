
public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstname("Max");
        System.out.println(p1.getFirstname());


        Person p2 = new Person("Ina","Müller");

        System.out.println(p2.getLastname());


        Person p3 = new Person("Lehmann");


        Person p4 = new Person();
        System.out.println(p4.getLastname());


        System.out.println(p1);
        System.out.println(p2);


        p1.setFirstname("Karl");


    }
}