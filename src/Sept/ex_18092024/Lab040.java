package Sept.ex_18092024;

public class Lab040 {
    public static void main(String[] args) {
        //GST example
        int course=100;
        float GST=18.45F;
        //int total_price=course+GST;  //narrowing-implicit-JVM-Invalid error
        float total_price1=course+GST;
        System.out.println(total_price1);  //widening implicit JVM

        //but we want to store the data in int
        int total_price2=course+(int)GST; //narrowing explicit -loose of data
        System.out.println(total_price2);
    }
}
