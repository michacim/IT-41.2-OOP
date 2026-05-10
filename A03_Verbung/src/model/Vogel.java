package model;

public class Vogel extends Tier{

    private boolean canFly;

    public Vogel(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Vogel{" +
                "canFly=" + canFly +
                "} " + super.toString();
    }
}
