package Practice.vehicleFactory.Parts.Automobile;

import Practice.vehicleFactory.Parts.General.Wheels;

public class CarWheels extends Wheels {
    private boolean isTurning;
    public CarWheels() {
        super();
        isTurning = false;
    }
    public void setIsTurning(boolean currentTurningState) {
        isTurning = currentTurningState;
    }
    public boolean getIsTurning() {
        return isTurning;
    }
}
