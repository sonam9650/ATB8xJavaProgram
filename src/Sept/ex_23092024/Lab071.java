package Sept.ex_23092024;

public class Lab071 {
    public static void main(String[] args) {
        //Switch condition without break
        int day=1;
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No idea, What day it is");
        }
        System.out.println("End of the loop");
    }
}
