import model.Adresse;
import model.Kunde;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kunde k1 = new Kunde("KN000112","Max","Meier",new Adresse("Berlin","Teststrasse 3","12345"));
        k1.setLieferAdresse(new Adresse("Berlin","Dorfstraße 4","102345"));

        System.out.println(k1);


    }
}