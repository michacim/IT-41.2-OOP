package model;


import java.util.ArrayList;

public class Gehege {

    private  int id;
    private int flaeche;

   private ArrayList<Tier> tiere = new ArrayList<>();

    public Gehege(int id, int flaeche) {
        this.id = id;
        this.flaeche = flaeche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public ArrayList<Tier> getTiere() {
        return tiere;
    }

    public void addTier(Tier tier){
        tiere.add(tier);
    }
    public  void removeTier(Tier tier){
        tiere.remove(tier);
    }

    @Override
    public String toString() {
        return "Gehege{" +
                "id=" + id +
                ", flaeche=" + flaeche +
                ", tiere=" + tiere +
                '}';
    }
}
