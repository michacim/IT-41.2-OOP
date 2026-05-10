package model;

public class Elefant extends SaeugeTier{


    public Elefant(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Elefant: " + super.toString();
    }
}
