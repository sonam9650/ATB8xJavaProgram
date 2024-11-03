package Oct.ex_09102024Polymorphism.methodoverriding;

public class Lab138 {
    public static void main(String[] args) {
        Germanshephered barking=new Germanshephered();
        barking.bark();

        Dog dog=new Dog();
        dog.bark();

        Sonam s=new Sonam();
        s.home();

        Father f=new Father();
        f.home();

        //Dynamic Dispatch
        Father object=new Sonam();
        object.home();

//        Sonam object1=new Father();
//        object1.home();

    }
}
