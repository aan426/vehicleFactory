package main.java.Parts.Automobile;

public class FrontWheelDrive implements DriveTrain{
    @Override
    public void drive(CarWheels wheels) {
        System.out.println("Power goes to the front wheels.");
        wheels.getFrontWheels().roll();
    }
}
