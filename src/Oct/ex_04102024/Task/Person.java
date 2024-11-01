package Oct.ex_04102024.Task;

public class Person {

        //Create a Person Class with 10 A, 5 Behavr( All types of Methods)
        // and use the DC and PC to set the values, Create 5 Objects

//10 attributes
    String first_Name;
    String last_Name;
    int age;
    long phoneno;
    int rollno;
    boolean isfemale;
    long aadhar;
    int hands;
    int legs;
    String address;

    // 5 Behaviours

    void cook(){}

    void walk(){
        System.out.println("no return no argument");
    }

    String sleep (String name) {
        System.out.println("i am sleeping");
        System.out.println("Return type with argument");
        return "i am sleeping";
    }

    int talk(){
        System.out.println("Return type with no argument");
        return 100;
    }

    void eat (String name){
        System.out.println("Eat");
        System.out.println("no return type with argument");
    }

     //Default constructor
    Person (){
        System.out.println("I am default constructor");
    }

    //Parameterized constructor
    Person (String first_Name,String last_Name,String address,int age,int rollno,int hands,int legs,long phoneno,long aadhar,boolean isfemale ){
        System.out.println("I am Parameterized constructor");
        this.first_Name=first_Name;
        this.last_Name=last_Name;
        this.age=age;
        this.phoneno=phoneno;
        this.rollno=rollno;
        this.isfemale=isfemale;
        this.aadhar=aadhar;
        this.hands=hands;
        this.legs=legs;
        this.address=address;
    }


}

