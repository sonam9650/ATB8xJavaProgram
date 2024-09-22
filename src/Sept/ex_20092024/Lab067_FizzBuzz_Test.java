package Sept.ex_20092024;

import java.util.Scanner;

public class Lab067_FizzBuzz_Test {
    public static void main(String[] args) {
        //✅ FizzBuzz Test:
        //Write a program that prints numbers from 1 to 100. However, for multiples of 3
        // print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 100 only" );
        int i=sc.nextInt();
            if ((i%3==0) && (i%5!=0)) {
                System.out.println("Fizz");
            }else if ((i%5==0) && (i%3!=0)){
                System.out.println("Buzz");
            }else if((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Not divisible by 3 or 5");
            }
        }
    }
