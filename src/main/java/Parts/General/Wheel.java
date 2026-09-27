package main.java.Parts.General;


public class Wheel {
    private boolean isRotating;

    public Wheel() {
        isRotating = false;
    }

    public void rotate() {
        isRotating = true;
    }

    public void stop() {
        isRotating = false;
    }

    public boolean isRotating() {
        return isRotating;
    }
}

// public class Wheels {
//     protected boolean isAccelerating;
//     public Wheels() {
//         // System.out.println("Wheels created");
//         isAccelerating = false;
//     }
//     public void setIsAccelerating(boolean currentWheelState) {
//         isAccelerating = currentWheelState;
//     }

//     public boolean getIsAccelerating() {
//         return isAccelerating;
//     }
// }
