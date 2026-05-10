

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("978-3-8668-0192-9","Das große Kochbuch");
        Book b2 = new Book("178-3-8668-0111-9","Java 1");



        System.out.println(b1);

        b2.setId(2);
        b2.setAvailable(false);
        System.out.println(b2);
    }

}