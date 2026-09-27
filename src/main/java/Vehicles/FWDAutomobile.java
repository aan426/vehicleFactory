package main.java.Vehicles;

import main.java.Parts.Automobile.WheelPower;
import main.java.Parts.Automobile.SteeringSystem;
import main.java.Parts.General.Brake;
import main.java.Parts.General.Engine;
import main.java.Parts.General.Wheel;

public class FWDAutomobile implements IAutomobile {

    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private Wheel backLeftWheel;
    private Wheel backRightWheel;

    private Brake frontLeftBrake;
    private Brake frontRightBrake;
    private Brake backLeftBrake;
    private Brake backRightBrake;

    private Engine engine;
    private SteeringSystem steeringSystem;
    private WheelPower frontLeftWheelPower;
    private WheelPower frontRightWheelPower;

    public FWDAutomobile(
            Wheel frontLeftWheel,
            Wheel frontRightWheel,
            Wheel backLeftWheel,
            Wheel backRightWheel,
            Brake frontLeftBrake,
            Brake frontRightBrake,
            Brake backLeftBrake,
            Brake backRightBrake,
            Engine engine,
            SteeringSystem steeringSystem,
            WheelPower frontLeftWheelPower, 
            WheelPower frontRightWheelPower) {

        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.backLeftWheel = backLeftWheel;
        this.backRightWheel = backRightWheel;

        this.frontLeftBrake = frontLeftBrake;
        this.frontRightBrake = frontRightBrake;
        this.backLeftBrake = backLeftBrake;
        this.backRightBrake = backRightBrake;

        this.engine = engine;
        this.steeringSystem = steeringSystem;
        
        this.frontLeftWheelPower = frontLeftWheelPower;
        this.frontRightWheelPower = frontRightWheelPower;
    }

    @Override
    public void turnOn() {
        engine.turnOn();
    }

    @Override
    public void turnOff() {
        engine.turnOff();
    }

    @Override
    public void accelerate() {
        if(engine.isRunning()){
            frontLeftWheelPower.accelerate();
            System.out.println("Front Left Wheel");
            frontRightWheelPower.accelerate();
            System.out.println("Front Right Wheel");
    
            frontLeftWheel.rotate();
            frontRightWheel.rotate();
            backLeftWheel.rotate();
            backRightWheel.rotate();
        }   
    }

    @Override
    public void decelerate() {
        if(frontLeftWheel.isRotating() && frontRightWheel.isRotating()){
            frontLeftWheelPower.decelerate();
            System.out.println("Front Left Wheel");
            frontRightWheelPower.decelerate();
            System.out.println("Front Right Wheel");
        }   
    }

    @Override
    public void brake() {
        frontLeftBrake.applyBrake();
        frontRightBrake.applyBrake();
        backLeftBrake.applyBrake();
        backRightBrake.applyBrake();
    }

    @Override
    public void steer(double leftWheelAngle, double rightWheelAngle) {
        steeringSystem.steer(leftWheelAngle, rightWheelAngle);
    }
}

// package main.java.Vehicles;

// import main.java.Parts.Automobile.CarWheels;
// import main.java.Parts.General.Breaks;
// import main.java.Parts.General.Engine;
// import main.java.Parts.Automobile.DriveTrain;

// public class Automobile {
//     private Breaks breaks;
//     private CarWheels wheels;
//     private DriveTrain driveTrain;
//     private Engine engine;

//     public Automobile(DriveTrain driveTrain) {
//         breaks = new Breaks();
//         wheels = new CarWheels();
//         engine = new Engine();
//         this.driveTrain = driveTrain;
//     }

//     public boolean getEngineState() {
//         return engine.getIsEngineRunning();
//     }

//     public boolean getWheelsAccelState() {
//         return wheels.getFrontWheels().getIsRolling()
//             || wheels.getRearWheels().getIsRolling();
//     }

//     public boolean getWheelsTurningState() {
//         return wheels.getFrontWheels().getIsTurning();
//     }

//     public boolean getBreaksState() {
//         return breaks.getIsBraking();
//     }

//     public void startEngine() {
//         System.out.println("Starting car engine");
//         engine.setIsEngineRunning(true);
//     }

//     public void stopEngine() {
//         System.out.println("Stopping car engine");
//         engine.setIsEngineRunning(false);
//     }

//     public void accelerateWheels() {

//         if (engine.getIsEngineRunning()) {
//             System.out.println("Accelerating car wheels");
//             driveTrain.drive(wheels);
//         }
//         else {
//             System.out.println(
//                 "Engine is not running, cannot accelerate wheels"
//             );
//         }
//     }

//     public void turnWheels() {

//         if (engine.getIsEngineRunning()) {
//             System.out.println("Turning car wheels");
//             wheels.getFrontWheels().turn();
//         }
//         else {
//             System.out.println(
//                 "Engine is not running, cannot turn wheels"
//             );
//         }
//     }

//     public void decelerate() {

//         System.out.println("Decelerating car");

//         wheels.getFrontWheels().stopRolling();
//         wheels.getRearWheels().stopRolling();

//         breaks.setIsBraking(true);
//     }



//     // private Breaks breaks;
//     // // private CarWheels wheels;
//     // private DriveTrain driveTrain;
//     // private Engine engine;
//     // public Automobile(DriveTrain driveTrain) {
//     //     breaks = new Breaks();
//     //     // wheels = new CarWheels();
//     //     engine = new Engine();
//     //     this.driveTrain = driveTrain;

//     // }

//     // public boolean getEngineState(){
//     //     return engine.getIsEngineRunning();
//     // }
//     // public boolean getWheelsAccelState(){
//     //     return wheels.getIsAccelerating();
//     // }
//     // public boolean getWheelsTurningState(){
//     //     return wheels.getIsTurning();
//     // }
//     // public boolean getBreaksState(){
//     //     return breaks.getIsBraking();
//     // }

//     // public void startEngine() {
//     //     System.out.println("Starting car engine");
//     //     engine.setIsEngineRunning(true);
//     // }

//     // public void stopEngine() {
//     //     System.out.println("Stopping car engine");
//     //     engine.setIsEngineRunning(false);
//     // }

//     // public void accelerateWheels() {
//     //     if (engine.getIsEngineRunning()) {
//     //         System.out.println("Accelerating car wheels");
//     //         wheels.setIsAccelerating(true);
//     //     }
//     //     else{
//     //         System.out.println("Engine is not running, cannot accelerate wheels");
//     //     } 
//     // }

//     // public void turnWheels() {
//     //     if(engine.getIsEngineRunning()) {
//     //         System.out.println("Turning car wheels");
//     //         wheels.setIsTurning(true);
//     //     }
//     //     else{
//     //         System.out.println("Engine is not running, cannot turn wheels");
//     //     }
//     // }

//     // // public void unTurnWheels() {
//     // //     if(engine.getIsEngineRunning()) {
//     // //         System.out.println("Straightening car wheels");
//     // //         wheels.setIsTurning(false);
//     // //     }
//     // //     else{
//     // //         System.out.println("Engine is not running, cannot turn wheels");
//     // //     }
//     // // }

//     // public void decelerate(){
//     //     System.out.println("Decelerating car");
//     //     wheels.setIsAccelerating(false);
//     //     breaks.setIsBraking(true);
//     // }
// }
