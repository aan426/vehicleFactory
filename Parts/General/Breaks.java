package Practice.vehicleFactory.Parts.General;

public class Breaks {
    private boolean isDecelerating;
    public Breaks() {
        System.out.println("Breaks created");
        isDecelerating = false;
    }
    public void setIsBraking(boolean currentDecelerateState) {
        isDecelerating = currentDecelerateState;
    }

    public boolean getIsBraking() {
        return isDecelerating;
    }
}
