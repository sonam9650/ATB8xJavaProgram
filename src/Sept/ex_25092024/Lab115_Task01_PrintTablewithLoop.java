package Sept.ex_25092024;

import java.util.Scanner;

public class Lab115_Task01_PrintTablewithLoop {
    public static void main(String[] args) {
        // Table of number n = 10, print table with For or while

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num =sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }

    }
}
