package Practice.vehicleFactory.Parts.General;

public class Wheels {
    private boolean isAccelerating;
    public Wheels() {
        System.out.println("Wheels created");
        isAccelerating = false;
    }
    public void setIsAccelerating(boolean currentWheelState) {
        System.out.println("Wheels are accelerating");
        isAccelerating = currentWheelState;
    }
}
