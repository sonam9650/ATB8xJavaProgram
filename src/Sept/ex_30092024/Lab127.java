package Sept.ex_30092024;

public class Lab127 {
    public static void main(String[] args) {
        //FUNCTIONS
        //calling a function
        greet();
        functionName();
        greet();
        greet();
        greet();

        //or calling a function 100 times
        for (int i=0;i<100;i++){
            greet();
        }
    }

    //difining part of function
    //No return type or no argument

    //1. Without parameters and without return type

    public static void functionName(){
        System.out.println("This is void function");
    }

    public static void greet(){
        System.out.println("Hi");
    }
}
