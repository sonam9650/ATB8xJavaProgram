package Sept.ex_30092024;

public class Lab128 {
    public static void main(String[] args) {
        //Function type

        function_type1();
        String name = function_type2();
        System.out.println(name);
        function_type3("Vivek", 24);
        int result=function_type4(3,5);
        System.out.println(result);
    }

    //1. Without parameters and without return type
    public static void function_type1() {
        System.out.println("1. Without parameters and without return type");
    }

    //2. Without parameters but with return type
    public static String function_type2() {
        System.out.println("2. Without parameters but with return type");
        return "Sonam";
    }

    //3.With parameters and without return type
    public static void function_type3(String name2,int age) {
        System.out.println("3.With parameters and without return type");
        System.out.println("you have shared-->" + name2 + age);
    }

    //4.With parameters and with return type

    public static int function_type4(int a ,int b ){
        System.out.println("4.With parameters and with return type");
        return a+b;
    }
}