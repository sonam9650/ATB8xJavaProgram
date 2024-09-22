package Sept.ex_20092024;

public class Lab060 {
    public static void main(String[] args) {
        // condition a=!a means not true it gets false
        // if condition doesnt have else part for false condition
        //  then it comes out from program and print Outside->" + a

        boolean a=true;
           a=!a;
           if (2+2<4){
               System.out.println("Inside the loop");
           }
        System.out.println("Outside->" + a);


        // condition a=!a means not true it gets false
        // if condition now true then if part will be executed
        // then it comes out from program and print Outside->" + a

        boolean b=true;
        b=!b;
        if (2+2<5){
            System.out.println("Inside the loop");
        }
        System.out.println("Outside->" + a);
    }

    }



