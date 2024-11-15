package Oct.ex_16102024;

public class Lab152 {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        new A();

    }
}


class A{
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }
}
