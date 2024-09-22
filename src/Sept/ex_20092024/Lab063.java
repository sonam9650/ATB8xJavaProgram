package Sept.ex_20092024;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a program that calculates and displays
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter Score");
         int score= sc.nextInt();

         if (score>=90 && score<=100){
             System.out.println('A');
         } else if (score<90 && score>=80 ) {
             System.out.println('B');
         } else if (score<80 && score>=70) {
             System.out.println('c');
         } else if (score<70 && score>=60){
             System.out.println('D');
         } else if (score<60 && score>50) {
             System.out.println('E');
         }
         else{
             System.out.println('F');
         }

    }
}
