import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Kochbuch","131212311", List.of(new Author("Max"), new Author("Otto")));

        Book b1 = new Book("Java 1","312313123131",new Author("Maxe "));



        System.out.println(b1);
        b1.addAuthor(new Author("Ina"));
        System.out.println(b1);

        // Book -> ArrayList -> Author -> String
        System.out.println(b1.getAuthors().getFirst().getName()    );//Maxe   -> get(0)



        ////////////////////////////////////////
        Customer c1 = new Customer("KN00001","Max Meier");
        Cart cart1  =  new Cart();
        c1.setCart(cart1);

        cart1.addBook(new Book("Java 2","13121312313"));

        System.out.println(c1);

        System.out.println(book);

    }
}