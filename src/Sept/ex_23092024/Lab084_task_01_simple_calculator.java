package Sept.ex_23092024;

public class Lab084_task_01_simple_calculator {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication,
        // and division, modulus based on user input using switch statements.
        //Inputs : num 1, num 2, +
        //Output : num1+num2 → print information.

        int num1=8;
        int num2=4;
        char operator='%';
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case  '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
        }
    }
}
