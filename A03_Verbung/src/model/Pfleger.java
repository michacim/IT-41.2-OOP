package model;

import java.util.ArrayList;

public class Pfleger {

    private String name;
    private ArrayList<Gehege> gehegeList = new ArrayList<>();

    public Pfleger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Gehege> getGehegeList() {
        return gehegeList;
    }
    public void addGehege( Gehege gehege){
        gehegeList.add(gehege);
    }

    @Override
    public String toString() {
        return "Pfleger{" +
                "name='" + name + '\'' +
                ", gehegeList=" + gehegeList +
                '}';
    }
}
