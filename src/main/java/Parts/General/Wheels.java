package Practice.vehicleFactory.src.main.java.Parts.General;

public class Wheels {
    protected boolean isAccelerating;
    public Wheels() {
        // System.out.println("Wheels created");
        isAccelerating = false;
    }
    public void setIsAccelerating(boolean currentWheelState) {
        System.out.println("Wheels are accelerating");
        isAccelerating = currentWheelState;
    }

    public boolean getIsAccelerating() {
        return isAccelerating;
    }
}
