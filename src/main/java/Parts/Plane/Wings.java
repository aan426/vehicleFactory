package Practice.vehicleFactory.src.main.java.Parts.Plane;

public class Wings {
    private boolean isAscending;
    private boolean isDescending;
    private boolean isFlying;
    public Wings(){
        isAscending = false;
        isDescending = false;
        isFlying = false;
    }

    public void setAscending(boolean state){
        isAscending = true; 
    }
    public void setDescending(boolean state){
        isDescending = true; 
    }
    public void setFlying(boolean state){
        isFlying = true; 
    }

    public boolean getIsAscending(){
        return isAscending; 
    }
    public boolean getIsDescending(){
        return isDescending; 
    }
    public boolean getIsFlying(){
        return isFlying; 
    }
}
