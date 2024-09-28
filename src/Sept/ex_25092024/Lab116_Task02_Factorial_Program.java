package Sept.ex_25092024;

import java.util.Scanner;

public class Lab116_Task02_Factorial_Program {
    public static void main(String[] args) {
        //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        //        // n = 1 ->  Fact = 1*1 -> 1
        //        // n = 3 -> Fact = 3*2*1 -> 6

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the number: ");
                int num1 =sc.nextInt();

                int num2 = 1;

                for (int i = num1; i > 0; i--) {
                    num2 *= i;
                }

                System.out.println("Factorial of " + num1 + " is: " + num2);
            }
        }
