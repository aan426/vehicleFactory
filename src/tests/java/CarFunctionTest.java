package Practice.vehicleFactory.src.tests.java;

import Practice.vehicleFactory.src.main.java.Vehicles.Automobile;


public class CarFunctionTest{
    public static void main(String[] args) {
        Automobile carSuccess = new Automobile();
        Automobile carFailure = new Automobile();

        System.out.println("Car 1:");
        carSuccess.startEngine();
        testStartEngine(carSuccess);

        carSuccess.accelerateWheels();
        testAccelerateWheels(carSuccess);

        carSuccess.turnWheels();
        testTurnWheels(carSuccess);

        carSuccess.decelerate();
        testDecelerate(carSuccess);

    
        System.out.println("\nCar 2:");
        testStartEngine(carFailure);
        carFailure.accelerateWheels();
        testAccelerateWheels(carFailure);
        carFailure.turnWheels();
        testTurnWheels(carFailure);
        testDecelerate(carFailure);
    }

    public static void testStartEngine(Automobile car) {
        // car.startEngine();
        if(car.getEngineState()){
            System.out.println("Car engine succesfully started; Test success");
        }
        else{
            System.out.println("Car engine didn't start; Test failed");
        }
    }

    public static void testAccelerateWheels(Automobile car) {
        if(car.getWheelsAccelState()){
            System.out.println("Car wheels succesfully accelerated; Test success");
        }
        else{
            System.out.println("Car wheels didn't accelerate; Test failed");
        }
    }

    public static void testTurnWheels(Automobile car) {
        if(car.getWheelsTurningState()){
            System.out.println("Car wheels succesfully turned; Test success");
        }
        else{
            System.out.println("Car wheels didn't turn; Test failed");
        }
    }

    public static void testDecelerate(Automobile car) {
        if(car.getBreaksState()){
            System.out.println("Car wheels succesfully decelerated; Test success");
        }
        else{
            System.out.println("Car wheels didn't decelerate; Test failed");
        }
    }

    // public void testStartEngineFailure(Automobile car) {
    //     car.startEngine();
    //     if(car.getEngineState()){
    //         System.out.println("Car engine succesfully started; Test success");
    //     }
    //     else{
    //         System.out.println("Car engine didn't start; Test failed");
    //     }
    // }
}
