
/*simple instantiation example*/
//a class with constructors and some methods needed
public class Computer {
    // properties
    private String brandName;    //brand name
    private int cpuSpeed;    //cpu
    private int ramSize;    //ram size
    private boolean turnedOn;    //boolean variable turnedOn
    private String ownerName;    //owner name    
        
    public Computer() {
    //a default constructor and assign each of value to properties
        this.brandName = "HP";
        this.cpuSpeed = 100;
        this.ramSize = 16;
        this.ownerName = "Shop";
        this.turnedOn = false;    //set as false.
        
    }
    
    public Computer(String brandName, int cpuSpeed, int ramSize, boolean turnedOn, String ownerName) {
        //a specified constructor and and assign each of value to properties
        this.brandName = brandName;
        this.cpuSpeed = cpuSpeed;
        this.ramSize = ramSize;
        this.ownerName = ownerName;
        this.turnedOn = false;    //set as false.
        
    }
    
    public void setRamSize (int newRamSize) {
        //a setter for ramSize
        this.ramSize = newRamSize;
    }
    
    public int getRamsize() {
        //a getter for ramSize
        return this.ramSize;
    }
    
    public void setCPUSpeed (int newCPUSpeed) {
        //a setter for cpu speed
        this.cpuSpeed = newCPUSpeed;
    }
    
    public int getCPUSpeed() {
        //a getter for cpu speed
        return this.getCPUSpeed();
    }
    
    public void sell_To(String newOwner) {
        //setter for the owner name
        //sell to new owner
        this.ownerName = newOwner;    //set the owerName to newOwner
        System.out.println(this.whoOwns() + " bought the pc: \nbrand: " + this.brandName + "\nCPU: " + this.cpuSpeed + "\nRAM: " + this.ramSize);
    }
    public String whoOwns() {
        //getter for the owner name
        if (this.ownerName == null) {
            System.out.println("No Owner");
            return null;
            
        }else {
            //return the owner name
            return this.ownerName;
        }
    }
    
    //Or just set as void
    public boolean turnOn() {
        //set the turnedOn to true
        
        System.out.println("The computer belonging to " + this.ownerName + " has been turned on");
        this.turnedOn = true;
        return this.turnedOn;    //this is very important. after assigning this.turnedOn = ture, you have to return the value! 
//        return true;    not this. it is just to return true of the boolean method.
    }
    
    
    //Or just set as void
    public boolean turnOff() {
        //set the turnedOn to false        
        System.out.println("Shutting down. Please wait while I update this machine");
        this.turnedOn = false;
        return false;
   }
    
}
