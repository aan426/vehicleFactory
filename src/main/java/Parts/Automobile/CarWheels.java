package main.java.Parts.Automobile;

import main.java.Parts.General.Wheels;



public class CarWheels {

    private FrontWheels frontWheels;
    private RearWheels rearWheels;

    public CarWheels() {
        frontWheels = new FrontWheels();
        rearWheels = new RearWheels();
    }

    public FrontWheels getFrontWheels() {
        return frontWheels;
    }

    public RearWheels getRearWheels() {
        return rearWheels;
    }
}
// public class CarWheels extends Wheels {
//     private boolean isTurning;
//     public CarWheels() {
//         super();
//         isTurning = false;
//     }
//     public void setIsTurning(boolean currentTurningState) {
//         isTurning = currentTurningState;
//     }
//     public boolean getIsTurning() {
//         return isTurning;
//     }
// }
