package Sept.ex_20092024;

import java.util.Scanner;

public class Lab066_Triangle_Classifier {
    public static void main(String[] args) {
        //✅ Triangle Classifier ( If)
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter Side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter Side 3");
        int side3 = sc.nextInt();
        if (side1 >= 0 && side2 >= 0 && side3 >= 0) {

            if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
                System.out.println(" Triangle is equilateral 'all sides are equal' ");
            } else if ((side1 != side2) && (side2 != side3) && (side3 != side1)) {
                System.out.println(" Triangle is scalene 'no sides are equal' ");
            } else {
                System.out.println(" Triangle is isosceles 'exactly two sides are equal' ");
            }
        }else{
            System.out.println("Negative side");
        }
    }
}