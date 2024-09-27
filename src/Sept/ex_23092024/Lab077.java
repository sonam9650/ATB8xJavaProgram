package Sept.ex_23092024;

public class Lab077 {
    public static void main(String[] args) {
        //break remove from new method which is available 13 above JDK versions

        int itemcode=001;
        switch (itemcode){
            case 001-> System.out.println("It is a Laptop");
            case 002-> System.out.println("It is a Desktop");
            case 003,004-> System.out.println("It is a Mobile");
            default-> System.out.println("None");
        }
    }
}
