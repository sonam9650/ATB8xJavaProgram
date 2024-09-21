package Sept.ex_18092024;

public class Lab039 {
    public static void main(String[] args) {
        long phone_number=9650395089L;
        //short s=phone_number;           //narrowing -implicit -JVM -invalid
        short s1=(short)phone_number;   // narrowing -explicit -data loss -invalid
        System.out.println(s1);
    }
}
