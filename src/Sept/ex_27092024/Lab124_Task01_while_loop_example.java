package Sept.ex_27092024;

import java.util.Scanner;

public class Lab124_Task01_while_loop_example {
    public static void main(String[] args) {

        //While example print table of any number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for print table : ");
        int num=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }
}
