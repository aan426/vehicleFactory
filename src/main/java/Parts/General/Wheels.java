package main.java.Parts.General;


public class Wheels {

    private boolean isRolling;

    public Wheels() {
        isRolling = false;
    }

    public void roll() {
        isRolling = true;
    }

    public void stopRolling() {
        isRolling = false;
    }

    public boolean getIsRolling() {
        return isRolling;
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
