package Practice.vehicleFactory.src.main.java.Parts.General;

public class Wheels {
    protected boolean isAccelerating;
    public Wheels() {
        // System.out.println("Wheels created");
        isAccelerating = false;
    }
    public void setIsAccelerating(boolean currentWheelState) {
        isAccelerating = currentWheelState;
    }

    public boolean getIsAccelerating() {
        return isAccelerating;
    }
}
