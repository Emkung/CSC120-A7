/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElavator;
  /**
   * constructor
   * @param name- name of the house
   * @param address- address of the house
   * @param nFloors- amount of floors of the house
   * @param hasDiningRoom- boolean of whether it has dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElavator) {
    // System.out.println("You have built a house: 🏠");
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElavator = hasElavator;
  }
  /**
   * Overloaded to create a default when making a house
   */
  public House() {
    // System.out.println("You have built a house: 🏠");
    super("Ziskind", "1 Henshaw Ave, Northampton, MA 01063", 3);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = true;
    this.hasElavator = true;
  }

    /** Accessor for hasDiningRoom 
     * @return boolean of whether there is a dining hall
    */
    public boolean hasDiningRoom() {
      return this.hasDiningRoom;
    }
    /** Accessor for hasDiningRoom 
     * @return boolean of whether there is an elevator
    */
    public boolean hasElavator() {
      return this.hasElavator;
    }
    /** Accessor for number of residents 
     * @return the amount of resident in the house
    */
    public int nResidents() {
      return this.residents.size();
    }
    /**
     * a method that adds resident in to the house 
     * @param name- name of the resident
     */
    public void moveIn(String name) {
      // check if this.residents contains name
      if (this.residents.contains(name)) {
        //   if so: throw and exception
        throw new RuntimeException(name + " is already a resident of " + this.getName());
      }
      // if we're good to go, add to roster
      this.residents.add(name);
      System.out.println(name + " has just moved into " + this.getName() + "! Go say hello :-)");
    }
    /**
     * Overloaded method to create a default person to move or out
     */
    public void moveIn() {
      // check if this.residents contains name
      if (this.residents.contains("Emily")) {
        //   if so: throw and exception
        throw new RuntimeException("Emily" + " is already a resident of " + this.getName());
      }
      // if we're good to go, add to roster
      this.residents.add("Emily");
      System.out.println("Emily" + " has just moved into " + this.getName() + "! Go say hello :-)");
    }
    /**
     * method that removes a person from a house 
     * @param name- name of the person m
     * @return the name of the person
     */
    public String moveOut(String name){// return the name of the person who moved out
      if (!this.residents.contains(name)) {
        throw new RuntimeException(name + " is not a resident of " + this.getName());
      }
      this.residents.remove(name);
      System.out.println(name + " has just moved out into " + this.getName());
      return name;
    }
    /**
     * Checks whether a person is from a house 
     * @param person- person we are identifying whether they live in the house 
     * @return boolean of whether the person lives in the house
     */
    public boolean isResident(String person){
      return this.residents.contains(person);
    }
    /**
     * a method that gives the description of the house 
     */
    public String toString() {
      String description = super.toString();
      description += " There are currently " + this.nResidents() + " people living in this house.";
      description += " This house ";
      if (this.hasDiningRoom) {
        description += "has";
      } else {
        description += "does not have";
      }
      description += " an active dining room.";
      return description;
    }
    public void showOptions() {
      super.showOptions();
      System.out.println("Available options at " + this.name + ":\n + moveIn() \n + moveOut()\n + goToFloor()");
  }
  public void goToFloor(int floorNum) {
    if (this.hasElavator == true){
      super.goToFloor(floorNum);
    }else{
      throw new RuntimeException("This house does not have an elevator, please use goUp() and goDown() method");
    }
}
  
    // public static void main(String[] args) {
    //   House morrow = new House("Morrow", "The Quad", 4, false);
    //   System.out.println(morrow);
    //   morrow.moveIn("Jordan");
    //   morrow.moveIn("Jordan");
    //   System.out.println(morrow);
    //   House king = new House("King", "The Quad", 3, true);
    //   System.out.println(king);
    // }
  
  }
