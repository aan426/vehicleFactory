package main.java.Parts.Automobile;

public class RearWheelDrive implements DriveTrain{
    @Override
    public void drive(CarWheels wheels) {
        System.out.println("Power goes to the rear wheels.");
        wheels.getRearWheels().roll();
    }
}
