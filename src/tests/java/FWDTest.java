package tests.java;

import main.java.Parts.Automobile.WheelPower;
import main.java.Parts.Automobile.SteeringSystem;
import main.java.Parts.General.Brake;
import main.java.Parts.General.Engine;
import main.java.Parts.General.Wheel;
import main.java.Vehicles.*;

public class FWDTest {

    public static void main(String[] args) {
        Wheel frontLeftWheel = new Wheel();
        Wheel frontRightWheel = new Wheel();
        Wheel backLeftWheel = new Wheel();
        Wheel backRightWheel = new Wheel();

        Brake frontLeftBrake = new Brake(frontLeftWheel);
        Brake frontRightBrake = new Brake(frontRightWheel);
        Brake backLeftBrake = new Brake(backLeftWheel);
        Brake backRightBrake = new Brake(backRightWheel);

        Engine engine = new Engine();
        SteeringSystem steeringSystem = new SteeringSystem(frontLeftWheel, frontRightWheel);
        WheelPower frontLeftWheelPower = new WheelPower(frontLeftWheel);
        WheelPower frontRightWheelPower = new WheelPower(frontRightWheel);

        FWDAutomobile fwdCar = new FWDAutomobile(frontLeftWheel, frontRightWheel, backLeftWheel, backRightWheel,
            frontLeftBrake, frontRightBrake, backLeftBrake, backRightBrake, engine, steeringSystem, 
            frontLeftWheelPower, frontRightWheelPower);

        fwdCar.turnOn();

        fwdCar.accelerate();

        fwdCar.steer(60, 60);

        fwdCar.decelerate();

        fwdCar.brake();  
        
        fwdCar.turnOn();
    }
}
