package Practice.vehicleFactory.Vehicles;

import Practice.vehicleFactory.Parts.General.Breaks;
import Practice.vehicleFactory.Parts.General.Engine;
import Practice.vehicleFactory.Parts.Automobile.CarWheels;

public class Automobile {
    private Breaks breaks;
    private CarWheels wheels;
    private Engine engine;
    public Automobile() {
        breaks = new Breaks();
        wheels = new CarWheels();
        engine = new Engine();
    }

    public void startEngine() {
        System.out.println("Starting car engine");
        engine.setIsEngineRunning(true);
    }

    public void stopEngine() {
        System.out.println("Stopping car engine");
        engine.setIsEngineRunning(false);
    }

    public void accelerateWheels() {
        if (engine.getIsEngineRunning()) {
            System.out.println("Accelerating car wheels");
            wheels.setIsAccelerating(true);
        }
        else{
            System.out.println("Engine is not running, cannot accelerate wheels");
        } 
    }

    public void turnWheels() {
        if(engine.getIsEngineRunning()) {
            System.out.println("Turning car wheels");
            wheels.setIsTurning(true);
        }
        else{
            System.out.println("Engine is not running, cannot turn wheels");
        }
    }

    public void unTurnWheels() {
        if(engine.getIsEngineRunning()) {
            System.out.println("Straightening car wheels");
            wheels.setIsTurning(false);
        }
        else{
            System.out.println("Engine is not running, cannot turn wheels");
        }
    }

    public void decelerate(){
        System.out.println("Decelerating car");
        wheels.setIsAccelerating(false);
        breaks.setIsBraking(true);
    }
}
