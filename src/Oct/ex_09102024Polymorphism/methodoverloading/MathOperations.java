package Oct.ex_09102024Polymorphism.methodoverloading;

public class MathOperations {
    int add (int a,int b){
        return a+b;
    }

    String add (String a,String b){
        return a+b;
    }

    double add(double a ,double b){
        return a+b;
        }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
