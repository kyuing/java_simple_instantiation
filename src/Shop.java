
public class Shop {
    
	public Shop() {
    
        Computer[] validComputer = new Computer[10]; // declare an array size as 10 computers
                
        for (int i=0; i<validComputer.length; i++) {
            /* check if the computers for sale are working well */
            
            validComputer[i] = new Computer();    //create a new default computer
            System.out.print("PC " + (i+1) + ": ");
            validComputer[i].turnOn();    //check turn on
            System.out.print("PC " + (i+1) + ": ");
            validComputer[i].turnOff();    //turn on
            System.out.println();
        }
        
        //create specified computers with the array above.
        validComputer[0] = new Computer("Apple", 100, 32, true, null);    //create a new specified computer
        validComputer[7] = new Computer("HP", 200, 128, true, "Carol");    //create a new specified computer
        validComputer[9] = new Computer("MicroSoft", 0, 0, true, null);    //create a new specified computer
        
        //sell PCs
        validComputer[0].sell_To("Ken");    //assign the owner's name
        System.out.println();
        validComputer[7].sell_To("Han");    //change the owner's name
        System.out.println();
        
        validComputer[9].setCPUSpeed(300);    //assign the CPU value directly
        validComputer[9].setRamSize(1024);    //assign the RAM value directly
        validComputer[9].sell_To("Michael");    //assign the owner's name
        System.out.println();
        
        //display the PC's power status depending on sale
        for (int i=0; i<validComputer.length; i++) {
            
            if (!validComputer[i].whoOwns().equalsIgnoreCase("shop")) {    //whoOwns() == shop
                //The owner of a PC is a customer
                System.out.print("PC " + (i+1) + ": ");
                validComputer[i].turnOn();
            
            }else {
                //still belonged to the shop
                System.out.print("PC " + (i+1) + ": ");
                validComputer[i].turnOff();
            }
        }        
    }
    
    public static void main(String[] args) {
        // invoke constructor
        new Shop();
    }
}


