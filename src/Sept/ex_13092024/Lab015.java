package Sept.ex_13092024;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        //Problem statement- table of two
        //Formatting
        int num=2;
        System.out.printf("value of %d",num);
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for table;- ");
        int tablenum= sc.nextInt();

        System.out.printf("%d * %d = %d",tablenum,1,tablenum*1 );


    }
}
