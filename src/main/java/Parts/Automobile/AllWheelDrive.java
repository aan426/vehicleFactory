package main.java.Parts.Automobile;

public class AllWheelDrive implements DriveTrain{
    @Override
    public void drive(CarWheels wheels) {
        System.out.println("Power goes to all wheels.");

        wheels.getFrontWheels().roll();
        wheels.getRearWheels().roll();
    }
}
