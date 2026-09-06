package Practice.vehicleFactory.Parts.General;

public class Engine {
    private boolean isRunning;
    public Engine() {
        System.out.println("Engine created");
        isRunning = false;
    }
    // private void turnOn() {
    //     System.out.println("Engine turned on");
    //     isRunning = true;
    // }
    // private void turnOff() {
    //     System.out.println("Engine turned off");
    //     isRunning = false;
    // }

    public boolean getIsEngineRunning() {
        return isRunning;
    }

    public void setIsEngineRunning(boolean currentState) {
        isRunning = currentState;
    }
}