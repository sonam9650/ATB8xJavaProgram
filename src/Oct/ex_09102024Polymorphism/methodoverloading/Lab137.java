package Oct.ex_09102024Polymorphism.methodoverloading;

public class Lab137 {
    public static void main(String[] args) {

        MathOperations sum=new MathOperations();
        int result=sum.add(3,4);
        System.out.println(result);


        String name=sum.add("Sonam","Verma");
        System.out.println(name);


    }

}
