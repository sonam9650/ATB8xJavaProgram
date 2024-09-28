package Sept.ex_27092024;
import java.util.Scanner;

public class Lab123_Task01_do_while_loop_example {
    public static void main(String[] args) {

       // Give me example of while vs do while loop in Lab ex.
       // Do while example

            Scanner scanner = new Scanner(System.in);
                int secretNumber = 7;
                int guess;
                int attempts = 0;

                do {
                    System.out.print("Guess the number (between 1 and 10): ");
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess != secretNumber) {
                        System.out.println("Wrong guess, try again.");
                    }
                } while (guess != secretNumber);

                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
                scanner.close();
    }
}




