package model;

public class Kunde {

    private String kundenNummer;
    private String vorname;
    private String nachname;
    private Adresse lieferAdresse;
    private Adresse rechnungsAdresse;

    public Kunde() {
    }

    public Kunde(String kundenNummer, String vorname, String nachname, Adresse rechnungsAdresse) {
        this.kundenNummer = kundenNummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.rechnungsAdresse = rechnungsAdresse;
    }

    public String getKundenNummer() {
        return kundenNummer;
    }

    public void setKundenNummer(String kundenNummer) {
        this.kundenNummer = kundenNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getLieferAdresse() {
        return lieferAdresse;
    }

    public void setLieferAdresse(Adresse lieferAdresse) {
        this.lieferAdresse = lieferAdresse;
    }

    public Adresse getRechnungsAdresse() {
        return rechnungsAdresse;
    }

    public void setRechnungsAdresse(Adresse rechnungsAdresse) {
        this.rechnungsAdresse = rechnungsAdresse;


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kunde{");
        sb.append("kundenNummer='").append(kundenNummer).append('\'');
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", lieferAdresse=").append(lieferAdresse);
        sb.append(", rechnungsAdresse=").append(rechnungsAdresse);
        sb.append('}');
        return sb.toString();
    }
}
