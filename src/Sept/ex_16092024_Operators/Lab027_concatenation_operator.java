package Sept.ex_16092024_Operators;

public class Lab027_concatenation_operator {
    public static void main(String[] args) {
        String first_name="Sonam";
        String last_name="verma";
        int a=10;
        int b=20;
        //concatenation operator +
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+(a+b));

    }
}
