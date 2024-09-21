package Sept.ex_18092024;

public class Lab038 {
    public static void main(String[] args) {
        //Widening
        byte b=10;
        int a=b;     //valid implicit casting-JVM
        int a1=(int)b; ////valid explicit casting-JVM
        System.out.println(a1);

        //Narrowing
        int val =300;
        //byte b1=val;    //Invalid implicit casting
        byte b2=(byte)val; //Invalid explicit Casting-Losing of data
        System.out.println(b2);
    }
}
