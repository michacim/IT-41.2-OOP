public class Barzahlung implements Zahlbar{


    @Override
    public void bezahlen(double betrag) {
        System.out.printf("Bahrzahlung über %s Euro wurde ausgeführt\n", betrag);
    }
}
