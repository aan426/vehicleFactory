package Practice.vehicleFactory.src.main.java.Vehicles;

import Practice.vehicleFactory.src.main.java.Parts.General.Breaks;
import Practice.vehicleFactory.src.main.java.Parts.General.Engine;
import Practice.vehicleFactory.src.main.java.Parts.General.Wheels;
import Practice.vehicleFactory.src.main.java.Parts.Plane.Wings;

public class Plane {
    private Engine engine;
    private Wheels wheels;
    private Wings wings;
    private Breaks breaks;
    public Plane(){
        engine = new Engine();
        wheels = new Wheels();
        wings = new Wings();
        breaks = new Breaks();
    }

    public boolean getEngineState(){
        return engine.getIsEngineRunning();
    }
    public boolean getWheelsAccelState(){
        return wheels.getIsAccelerating();
    }
    public boolean getBreaksState(){
        return breaks.getIsBraking();
    }
    public boolean getWingsAscendingState(){
        return wings.getIsAscending();
    }
    public boolean getWingsDescendingState(){
        return wings.getIsDescending();
    }

    public void startEngine(){
        engine.setIsEngineRunning(true);
    }

    public void accelerateWheels(){
        if(engine.getIsEngineRunning()){
            wheels.setIsAccelerating(true);
        }
        else{
            System.out.println("Engine not running, can't accelerate wheels");
        }
    }

    public void ascend(){
        if(wheels.getIsAccelerating() || wings.getIsFlying()){
            System.out.println("Plane is ascending");
            wings.setAscending(true);
            wings.setDescending(false);
        }
        else{
            System.out.println("Wheels not accelerating, can't take off");
        }
    }

    public void descend(){
        if(engine.getIsEngineRunning()){
            System.out.println("Plane is descending");
            wings.setAscending(false);
            wings.setDescending(true);
        }
        else{
            System.out.println("Engine not runnning, can't decelerate");
        }
    }

    public void decelerate(){
        System.out.println("Plane is decelerating");
        breaks.setIsBraking(true);
    }
}
