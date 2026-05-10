//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PayPal payPal = new PayPal("micha@web.de");
        KreditKarte kreditKarte =new KreditKarte("1112322342");
        Barzahlung barzahlung = new Barzahlung();


        payPal.bezahlen(20.50);
        kreditKarte.bezahlen(50);
        barzahlung.bezahlen(200);

//        Zahlbar pay = new PayPal("ina@gmail.com");
//        pay.bezahlen(10);


        Zahlbar[] zahlbarArray ={payPal,kreditKarte,barzahlung};
        for(Zahlbar z:zahlbarArray){
            z.bezahlen(100);
        }
    }
}