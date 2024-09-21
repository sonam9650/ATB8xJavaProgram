package Sept.ex_18092024;

import java.sql.SQLOutput;

public class Lab045 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++);
        System.out.println(a);

        // a=10 , after ++a it is now a=11, than after a++ a=11 same bcz later on it will be a=12)
        // print a=12 bcz previously a=11 then after a++ increment it will 12 and print

    }
}
