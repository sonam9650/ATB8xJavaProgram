package Sept.ex_18092024;

public class Lab050_Task_Que {
    public static void main(String[] args) {
        //Que-1.Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

        //Ans 1. Widening with Implicit and Explicit

        int a1=243324236;
        long b=a1;             //Implicit by JVM
        long b1=(long)a1;      // Explicit
        System.out.println(b);
        System.out.println(b1);

        //Ans 1. Narrowing with implicit and explicit

        long c=75634744620L;
        // int d=c;     //Implicit by JVM -> error
        int d1=(int)c;   // Explicit -> data loss
        System.out.println(d1);

        //Que-2. int a = 10; System.out.println(  --a + a --  + a-); System.out.println(a);
        //Ans. 26,7
        int a = 10;
        System.out.println(--a + a-- + a--);
        System.out.println(a);

        // Que-3. int a = 10; System.out.println(  --a + a++ + a—); System.out.println(a);
        //Ans. 28,9
        int a2 = 10;
        System.out.println(--a2 + a2++ + a2--);
        System.out.println(a2);

        //Que-4. int a = 10; System.out.println(  a- - + a --  + a --); System.out.println(a);

        int a3 = 10;
        System.out.println(a3-- + a3-- + a3--);
        System.out.println(a3);
    }
}
