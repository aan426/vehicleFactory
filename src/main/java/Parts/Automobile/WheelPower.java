package main.java.Parts.Automobile;

import main.java.Parts.General.Wheel;

/*Gives power to a wheel, replaces front/rear/AllWheelDrive */

public class WheelPower {
    private Wheel wheel;
    private boolean isPowered;

    public WheelPower(Wheel wheel) {
        this.wheel = wheel;
        isPowered = true;
    }

    public void accelerate() {
        isPowered = true;
        System.out.print("Applying engine power: ");
        // if(isPowered){
        //     double newspeed = wheel.getRotationSpeed() + speed;
        //     wheel.rotate(newspeed);
        // }
    }

    public void decelerate() {
        isPowered = false;
        System.out.print("Removing engine power: ");
    }

    public boolean isPowered(){
        return isPowered;
    }
}
