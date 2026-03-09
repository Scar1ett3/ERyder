public class ERyder {
    private String bikeID;
    private int batteryLevel;
    public boolean isAvailable;
    public float kmDriven;

    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, float kmDriven)
    {
        this.bikeID = bikeID;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
    }
    public ERyder(){
    }
    public void ride(){
        if(isAvailable == true && batteryLevel >= 10){
           System.out.println("You can ride this bike.");
        }
        else{
            System.out.println("You can't ride this bike. Please change one.");
        }
    }
    public void printBikeDetails(){
        System.out.println("The bike's ID is " + bikeID+".");
        System.out.println("The battery level is " + batteryLevel+"%.");
        if(isAvailable){System.out.println("The bike is available.");}
        else {System.out.println("The bike is not available.");}
        System.out.println("The bike's distance travelled in " + kmDriven + " km.");
    }

    //getters
    public String getBikeID(){
        return bikeID;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }
    //not necessary
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public float getKmDriven(){
        return kmDriven;
    }
    //
    //setters
    public void setBikeID(String bikeID){
        this.bikeID = bikeID;
    }
    public void setBatteryLevel(int batteryLevel){
        if(batteryLevel>=0 && batteryLevel<=100){this.batteryLevel = batteryLevel;}
        else {System.out.println("The batteryLevel must be from 0 to 100");}
    }
}
