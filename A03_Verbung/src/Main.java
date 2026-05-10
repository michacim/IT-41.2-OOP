import model.Elefant;
import model.Gehege;
import model.Pfleger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pfleger pfleger = new Pfleger("Max Meier");


        Gehege elefantenGehege = new Gehege(1,300);


        elefantenGehege.addTier(new Elefant("Dumbo"));
        pfleger.addGehege(elefantenGehege);

        System.out.println(pfleger);

    }
}