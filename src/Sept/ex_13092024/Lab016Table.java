package Sept.ex_13092024;

import java.util.Scanner;

public class Lab016Table {
    public static void main(String[] args) {
        //Print Table from user input
        Scanner PrintTable=new Scanner(System.in);
        System.out.println("Enter the number for table: ");
        int Tablenum=PrintTable.nextInt();

        System.out.printf("%d * %d = %d",Tablenum,1,Tablenum*1);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,2,Tablenum*2);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,3,Tablenum*3);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,4,Tablenum*4);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,5,Tablenum*5);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,6,Tablenum*6);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,7,Tablenum*7);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,8,Tablenum*8);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,9,Tablenum*9);
        System.out.println();
        System.out.printf("%d * %d = %d",Tablenum,10,Tablenum*10);
    }
}
