package Sept.ex_23092024;

public class Lab078 {
    public static void main(String[] args) {
        //Multiple print statements allowed and not allowed

        int itemcode=001;
        switch (itemcode){
            case 001-> System.out.println("It is a Laptop");
            //System.out.println("It is a Laptop");
            //System.out.println("It is a Laptop");
            //System.out.println("It is a Laptop");

            //Multiple print statements are not allowed
            case 002-> System.out.println("It is a Desktop");
            case 003,004-> System.out.println("It is a Mobile");
            default-> System.out.println("None");
        }

        int itemcode1=006;
        switch (itemcode1){
            case 001,002,005:
                System.out.println("All of them are Electronic gadgets");
                System.out.println("All of them are Electronic gadgets");
                System.out.println("All of them are Electronic gadgets");
                System.out.println("All of them are Electronic gadgets");

                //Multiple print statements allowed
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
