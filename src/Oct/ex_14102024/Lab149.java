package Oct.ex_14102024;

public class Lab149 {

}

interface I3{
    default void start(){
        System.out.println("only default has a body");
    }

    void stop();   // only allowed incomplete method
    void car();

    //void engine(){
      //  System.out.println("It has no body");
    //}

    static void tyre(){
        System.out.println("Static can also have a body");
    }
}

abstract class valid{       //both possible complete and incomplete
    void f6(){
        System.out.println("concrete method");
    }

    abstract void f9();

    static void f10(){
        System.out.println("possible static method ");
    }
}