package main.java.Parts.General;

public class Engine {
    private boolean isRunning;

    public Engine() {
        isRunning = false;
    }

    public void turnOn() {
        isRunning = true;
    }

    public void turnOff() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}