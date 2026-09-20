package Practice.vehicleFactory.src.main.java.Vehicles;
import Practice.vehicleFactory.src.main.java.Parts.Automobile.CarWheels;
import Practice.vehicleFactory.src.main.java.Parts.General.Breaks;
import Practice.vehicleFactory.src.main.java.Parts.General.Engine;

public class Train {
    private Breaks breaks;
    private CarWheels wheels;
    private Engine engine;
    public Train() {
        breaks = new Breaks();
        wheels = new CarWheels();
        engine = new Engine();
    }

    public boolean getEngineState(){
        return engine.getIsEngineRunning();
    }
    public boolean getWheelsAccelState(){
        return wheels.getIsAccelerating();
    }
    public boolean getWheelsTurningState(){
        return wheels.getIsTurning();
    }
    public boolean getBreaksState(){
        return breaks.getIsBraking();
    }

    public void startEngine() {
        System.out.println("Starting train engine");
        engine.setIsEngineRunning(true);
    }

    public void stopEngine() {
        System.out.println("Stopping train engine");
        engine.setIsEngineRunning(false);
    }

    public void accelerateWheels() {
        if (engine.getIsEngineRunning()) {
            System.out.println("Accelerating train wheels");
            wheels.setIsAccelerating(true);
        }
        else{
            System.out.println("Engine is not running, cannot accelerate wheels");
        } 
    }

    public void decelerate(){
        System.out.println("Decelerating train");
        wheels.setIsAccelerating(false);
        breaks.setIsBraking(true);
    }
}
