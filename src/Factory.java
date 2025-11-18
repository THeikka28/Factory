public class Factory {
    //these are instance variables, they are made in the world,
    //they are public, and can be used anywhere
public int yearFounded;
public boolean isopen;
public double earnings;
public String products;
//PSVM is this, it runs the code
    public static void main(String[] args) {
        System.out.println("Welcome to Toby's Factory");
        new Factory();


    }

//constructor (makes a usable block of code in this case factory)
    public Factory ()
    {
       /*. products = "Houses";
        yearFounded = 1890;
        isopen = true;
        earnings = 1.1;
        System.out.println("We Make houses!");
        factoryInfo();
        //chnage the value of yearFounded and IsOpen
        //then call it again
        products = "Houses";
        yearFounded = 2022;
        isopen = false;
        earnings = 0.0000000000000001;
        factoryInfo();/*/
        // type varName = value
        //this is a variable so complex it would be called an object
        //it is a variable made from the class house
        House h1 = new House();
        h1.owner = "Gabriel: AKA The Opps";
        h1.address = "1793 Canton Avenue, Milton ma, O2186";
        h1.isoccupied = true;
        h1.size = 115.23;
        h1.walls = 5;
        h1.houseInfo();

        House h2 = new House();
        h2.houseInfo();

        House myhouse = new House();
        myhouse.houseInfo();

        House customhouse = new House(982.243, 3, "Jimmy Jim Bob", "637 Hollis Street", false);
        customhouse.houseInfo();




    }

    public void factoryInfo()
    {

        System.out.println("Factory info:");
        System.out.println("We were founded in " + yearFounded);
        System.out.println("We have earned " + earnings + " million");
        System.out.println("We sell " + products);
        if (isopen == true) {
            System.out.println("Come in, we're open!!!");
        }
        if (isopen == false) {
            System.out.println("Get out of here, we're closed!!!");
        }

    }

    //world
}
