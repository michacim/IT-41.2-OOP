public class KreditKarte implements Zahlbar{
    private String kartenNummer;



    public KreditKarte(String kartenNummer) {
        this.kartenNummer = kartenNummer;
    }

    @Override
    public void bezahlen(double betrag) {
        System.out.printf("Kreditkartenzahlung über %s Euro mit Karte %s wurde ausgeführt\n",betrag, kartenNummer  );

    }
}
