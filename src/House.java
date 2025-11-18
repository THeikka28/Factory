public class House {
    //instance variables
    //1. at the top of class
    //2. can be used anywhere but psvm
    //3.have the world public before
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isoccupied;

    public void houseInfo (){
        System.out.println("The house belongs to " + owner + "." );
        System.out.println( "The address is " + address + ".");
        System.out.println("It is " + isoccupied + " that the house is occupied" + ".");
        System.out.println("The house is " + size+ " metres wide, and there are " + walls+ " walls.");
        System.out.println();
    }
//constructor
    //does not have void
    //has same name as the class
    //is a method
public House(){
    walls = 4;
    size = 3200.7;
    owner = "Bobby";
    address = "362 centre street";
    isoccupied = true;

}
    public House(double psize, int pwalls, String powner, String paddress, boolean pisoccupied){
    size = psize;
    walls = pwalls;
        owner = powner;
        address = paddress;
        isoccupied = pisoccupied;

    }
}
