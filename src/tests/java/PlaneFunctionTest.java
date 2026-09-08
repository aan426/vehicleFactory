package Practice.vehicleFactory.src.tests.java;

import Practice.vehicleFactory.src.main.java.Vehicles.Plane;

public class PlaneFunctionTest {
    public static void main(String[] args){
        Plane planeSuccess = new Plane();
        Plane planeFailure = new Plane();

        System.out.println("Car 1:");

        planeSuccess.startEngine();
        testStartEngine(planeSuccess);

        planeSuccess.accelerateWheels();
        testWheelAcceleration(planeSuccess);

        planeSuccess.ascend();
        testAscention(planeSuccess);

        planeSuccess.descend();
        testDescention(planeSuccess);

        planeSuccess.decelerate();
        testDeceleration(planeSuccess);

        System.out.println("\nCar 2:");
        testStartEngine(planeFailure);
        
        planeFailure.accelerateWheels();
        testWheelAcceleration(planeFailure);

        planeFailure.ascend();
        testAscention(planeFailure);

        planeFailure.descend();
        testDescention(planeFailure);

        planeFailure.decelerate();
        testDeceleration(planeFailure);
    }

    public static void testStartEngine(Plane plane) {
        // car.startEngine();
        if(plane.getEngineState()){
            System.out.println("Plane engine succesfully started; Test success");
        }
        else{
            System.out.println("Plane engine didn't start; Test failed");
        }
    }

    public static void testWheelAcceleration(Plane plane) {
        if(plane.getWheelsAccelState()){
            System.out.println("Plane wheels succesfully accelerated; Test success");
        }
        else{
            System.out.println("Plane wheels didn't accelerate; Test failed");
        }
    }


    public static void testDeceleration(Plane plane) {
        if(plane.getBreaksState()){
            System.out.println("Plane succesfully decelerated; Test success");
        }
        else{
            System.out.println("Plane didn't decelerate; Test failed");
        }
    }

    public static void testAscention(Plane plane) {
        if(plane.getWingsAscendingState()){
            System.out.println("Plane wings succesfully ascended; Test success");
        }
        else{
            System.out.println("Plane wing didn't ascend; Test failed");
        }
    }

    public static void testDescention(Plane plane) {
        if(plane.getWingsDescendingState()){
            System.out.println("Plane wings succesfully descended; Test success");
        }
        else{
            System.out.println("Plane wing didn't descend; Test failed");
        }
    }
}
