package main.java.Parts.General;

public class Brake {
    private Wheel wheel;

    public Brake(Wheel wheel) {
        this.wheel = wheel;
    }

    public void applyBrake() {
        wheel.stop();
    }
}
