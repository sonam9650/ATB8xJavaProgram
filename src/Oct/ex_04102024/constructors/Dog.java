package Oct.ex_04102024.constructors;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    //Default constructor
    Dog(){
        System.out.println("I am Default constructor");
    }

    //Parameterized constructor


    Dog(String breed) {
        System.out.println("I am Parameterized constructor1");
        this.breed = breed;

    }
    Dog(String name,int age,int legs,String breed){
        System.out.println("I am Parameterized constructor2");
        this.breed=breed;
        this.legs=legs;
        this.name=name;
        this.age=age;

    }

    void walk(){

    }
}
