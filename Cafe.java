/* This is a stub for the Cafe class */
/**
 * This class produces a Cafe building 
 */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    /**
     * constructor 
     * @param name- name of the cafe
     * @param address- address of the cafe 
     * @param nFloors- floors of the cafe
     * @param nCoffeeOunces- amount of coffee 
     * @param nSugarPackets- amount of sugar packets
     * @param nCreams- amount of creams
     * @param nCups- amount of cups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    /**
     * overloading the constructor to create a default cafe of Smith campus 
     */
    public Cafe() {
        super("Compass Cafe", "7 Neilson Drive, Northampton, MA 01063", 2);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams =100;
        this.nCups = 100;
    }
    /**
     * a method that restocks the amount of things in the Cafe
     * @param nCoffeeOunces- amount of coffee to add
     * @param nSugarPackets- amount of sugar packets to add
     * @param nCreams- amount of creams to add
     * @param nCups- amount of cups to add
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    /**
     * a method that decreases the amount of invetory by how is sold
     * @param size- amount of coffee to decrease
     * @param nSugarPackets- amount of sugar packets to decrease
     * @param nCreams- amount of creams to decrease 
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces < 1){
            this.restock(100, 0, 0, 0);
        }if (this.nSugarPackets < 1){
            this.restock(0, 100, 0, 0);
        }if (this.nCreams < 1){
            this.restock(0, 0, 100, 0);
        }if (this.nCups < 1){
            this.restock(0, 0, 0, 100);
        }
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        }
        /**
         * default for the amount of resources it take for one normal coffee
         */
        public void sellCoffee(){
            if (this.nCoffeeOunces < 1){
                this.restock(100, 0, 0, 0);
            }if (this.nSugarPackets < 1){
                this.restock(0, 100, 0, 0);
            }if (this.nCreams < 1){
                this.restock(0, 0, 100, 0);
            }if (this.nCups < 1){
                this.restock(0, 0, 0, 100);
            }
                this.nCoffeeOunces -= 10;
                this.nSugarPackets -= 2;
                this.nCreams -= 3;
                this.nCups -= 1;
            }
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n ");
    }    
    public void goToFloor(int floorNum) {
        throw new RuntimeException("There is no elavator here, please use goUp() and goDown() method");
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Boing Cafe", "ur mom", 4, 20, 20, 20, 20);
        myCafe.sellCoffee(20, 20, 20);
    }
    
}
