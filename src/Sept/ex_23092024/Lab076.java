package Sept.ex_23092024;

public class Lab076 {
    public static void main(String[] args) {
        // JDK>13 - 22 imp new concept-multiple test cases
        int itemcode=006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are Electronic gadgets");
                break;
            case 003,006,007:
                System.out.println("All of them are Mechanical gadgets");
                break;
            default:
                System.out.println("None");
                break;
        }

    }
}
