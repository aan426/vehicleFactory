package main.java.Parts.Automobile;

import main.java.Parts.General.Wheel;

public class SteeringSystem {
    private Wheel frontLeftWheel;
    private Wheel frontRightWheel;
    private SteeringShaft shaft;
    private double leftWheelAngle;
    private double rightWheelAngle;

    public SteeringSystem(Wheel frontLeftWheel, Wheel frontRightWheel) {
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.leftWheelAngle = 0;
        this.rightWheelAngle = 0;
        this.shaft = new SteeringShaft();
    }

    public void steer(double leftWheelAngle, double rightWheelAngle) {
        // Steering behavior would go here.
        // Both front wheels are controlled by the steering system.
        if(wheelsStraightening(leftWheelAngle, rightWheelAngle)){
            shaft.straighten();
        }
        else{
            shaft.turn();
        }
        this.leftWheelAngle = leftWheelAngle;
        this.rightWheelAngle = rightWheelAngle;
    }

    private boolean wheelsStraightening(double leftWheelAngle, double rightWheelAngle){
        return leftWheelAngle == 0 && rightWheelAngle == 0 ? true : false;
    }

    public class SteeringShaft {
        private boolean isTurning;
    
        public SteeringShaft() {
            isTurning = false;
        }
    
        public void turn() {
            isTurning = true;
        }
    
        public void straighten() {
            isTurning = false;
        }
    
        public boolean getIsTurning() {
            return isTurning;
        }
    }
}