public class PayPal implements Zahlbar{

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void bezahlen(double betrag) {
        System.out.println("PayPal-Zahlung über "+betrag +" Euro von "+email+" wurde ausgeführt.");
    }

}
