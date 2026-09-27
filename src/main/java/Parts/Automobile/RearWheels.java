package main.java.Parts.Automobile;
import main.java.Parts.General.Wheels;


public class RearWheels {
    private Wheels wheels;

    public RearWheels() {
        wheels = new Wheels();
    }

    public void roll() {
        wheels.roll();
    }

    public void stopRolling() {
        wheels.stopRolling();
    }

    public boolean getIsRolling() {
        return wheels.getIsRolling();
    }
}
