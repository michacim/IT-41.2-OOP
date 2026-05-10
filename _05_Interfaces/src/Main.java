import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        DocumentCreator dc = new HtmlCreator();
        dc.create();
        dc.info("Guten Tag");

        DocumentCreator tc = new TextCreator();
        tc.create();
        tc.info("Guten Tag");


        List<String> list = List.of("Max","Otto","Ina");


        Book b = new Book();

        b.setAuthors(list);
        System.out.println(b);



    }
}


