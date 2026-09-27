package main.java.Parts.Automobile;

import main.java.Parts.General.Wheels;

public class FrontWheels {
    private Wheels wheels;
    private SteeringShaft steeringShaft;

    public FrontWheels() {
        wheels = new Wheels();
        steeringShaft = new SteeringShaft();
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

    public void turn() {
        steeringShaft.turn();
    }

    public void straighten() {
        steeringShaft.straighten();
    }

    public boolean getIsTurning() {
        return steeringShaft.getIsTurning();
    }
}
