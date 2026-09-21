package main.java.Vehicles;

import main.java.Parts.General.*;

public interface IAutomobile {

    void turnOn();

    void accelerate();

    void decelerate();

    void brake();

    void steer(double leftWheelAngle, double rightWheelAngle);

    // void steerLeft(double leftWheelAngle, double rightWheelAngle);
    // void steerRight(double leftWheelAngle, double rightWheelAngle);
    // void steerStraight(double leftWheelAngle, double rightWheelAngle);

    void turnOff();

}