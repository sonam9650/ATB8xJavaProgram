package Sept.ex_23092024;

public class Lab069_Switch_condition {
    public static void main(String[] args) {
        //Switch condition
        int day=2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, What day it is");
                break;
        }
        System.out.println("End of the loop");
    }
}
