package Oct.ex_04102024.constructors;

public class Lab130 {
    public static void main(String[] args) {

        //here are 3 objects created and two reference is created
           AHuman amit=new AHuman();
           AHuman pramod=new AHuman("Pramod");
           AHuman vijay=new AHuman("Vijay");
           new AHuman();
           System.out.println(amit.planet);
           System.out.println(pramod.planet);
           System.out.println(amit.name);   //it will go to default con.
           System.out.println(pramod.name );  //parametrized con
           System.out.println(vijay.name);    //parametrized con

    }
}
