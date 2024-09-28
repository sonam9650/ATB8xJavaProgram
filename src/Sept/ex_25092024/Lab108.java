package Sept.ex_25092024;

public class Lab108 {
    public static void main(String[] args) {
        //if we use pre and post increment both are same working in loop

        for (int i = 1; i <= 10; i++) {    //post
            System.out.println(i);
        }

        for (int i = 1; i <= 10; ++i) {     //pre
            System.out.println(i);
        }
    }
}
