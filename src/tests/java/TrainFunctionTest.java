package Practice.vehicleFactory.src.tests.java;

import Practice.vehicleFactory.src.main.java.Vehicles.Train;

public class TrainFunctionTest {
    public static void main(String[] args){
        Train trainSuccess = new Train();
        Train trainFailure = new Train();

        System.out.println("Train 1:");
        trainSuccess.startEngine();
        testStartEngine(trainSuccess);

        trainSuccess.accelerateWheels();
        testAccelerateWheels(trainSuccess);

        trainSuccess.decelerate();
        testDecelerate(trainSuccess);

        trainSuccess.stopEngine();
        testStopEngine(trainSuccess);



    
        System.out.println("\nTrain 2:");
        trainSuccess.startEngine();
        trainFailure.stopEngine();
        testStartEngine(trainFailure);
        
        trainFailure.accelerateWheels();
        testAccelerateWheels(trainFailure);

        trainFailure.decelerate();
        testDecelerate(trainFailure);

        trainFailure.stopEngine();
        testStopEngine(trainFailure);
    }

    public static void testStartEngine(Train train) {
        // car.startEngine();
        if(train.getEngineState()){
            System.out.println("Train engine succesfully started; Test success");
        }
        else{
            System.out.println("Train engine didn't start; Test failed");
        }
    }

    public static void testStopEngine(Train train) {
        // car.startEngine();
        if(!train.getEngineState()){
            System.out.println("Train engine succesfully stopped; Test success");
        }
        else{
            System.out.println("Train engine didn't stop; Test failed");
        }
    }

    public static void testAccelerateWheels(Train train) {
        if(train.getWheelsAccelState()){
            System.out.println("Train wheels succesfully accelerated; Test success");
        }
        else{
            System.out.println("Train wheels didn't accelerate; Test failed");
        }
    }

    public static void testDecelerate(Train train) {
        if(train.getBreaksState()){
            System.out.println("Train wheels succesfully decelerated; Test success");
        }
        else{
            System.out.println("Train wheels didn't decelerate; Test failed");
        }
    }
}

