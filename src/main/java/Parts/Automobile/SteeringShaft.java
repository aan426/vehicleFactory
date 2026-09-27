package main.java.Parts.Automobile;

public class SteeringShaft {
    private boolean isTurning;

    public SteeringShaft() {
        isTurning = false;
    }

    public void turn() {
        isTurning = true;
    }

    public void straighten() {
        isTurning = false;
    }

    public boolean getIsTurning() {
        return isTurning;
    }
}
