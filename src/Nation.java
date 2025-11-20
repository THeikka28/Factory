public class Nation {
    public boolean isatwar;
    public String enemy;
    public double population;
    public String name;
    public String motto;
    public int budget;
    public int defensecost;
    public int socialsecurity;
    public int education;
    public int healthcare;
    public int wellfare;
    public int debt;
    public int soldiers;


    public void Strategicinfo (){
        soldiers = defensecost * 100;
        debt = budget - (defensecost+socialsecurity+education+healthcare+wellfare);
        System.out.println("Welcome to " + name + "!!!");
        if (isatwar = true) {
        System.out.println("We are at war with " + enemy + ". Join the army and defend your country!");
        }
        else {
            System.out.println("We're at peace.");
        }

        System.out.println("We have " + population +" million people living here.");
        System.out.println("The budget is " + budget + " million dollars.");
        System.out.println("We spend " + defensecost + " million on defense.");
        System.out.println("Due to our defense spending we have " + soldiers + " soldiers on duty.");
        System.out.println("We spend " + socialsecurity + " million on socialsecurity.");
        System.out.println("We spend " + education + " million on education.");
        System.out.println("We spend " + healthcare + " million on healthcare.");
        System.out.println("We spend " + wellfare + " million on wellfare.");
        if (debt > 0){
            System.out.println("We have a surplus of " + debt + " million dollars.");
        }
        if (debt < 0){
            System.out.println("We have a debt of " + -debt + " million dollars. We're cooked :(");
        }
        if (debt == 0){
            System.out.println("We are even right now.");
        }
        System.out.println("Remember: " + motto);

    }
    public Nation ()
    {
        isatwar = true;
        enemy = "Niam Nation";
        population = 569;
        name = "Toby's Tyrranical Territory tm";
        motto = "Stay Strong";
        budget = 765;
        defensecost = 736;
        socialsecurity = 2;
        education = 4;
        healthcare = 8000000;
        wellfare = 5;


    }
}
