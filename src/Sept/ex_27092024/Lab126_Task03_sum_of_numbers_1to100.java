package Sept.ex_27092024;

public class Lab126_Task03_sum_of_numbers_1to100 {
    public static void main(String[] args) {
            //Write a Java program that calculates the
            // sum of numbers from 1 to 100 using a while loop
         int i=1;
         int sum=0;
         while (i<=100){
             sum=sum+i;
             i++;
         }
         System.out.println(sum);
    }
}
