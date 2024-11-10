package Oct.ex_14102024;

public class Lab147 {
    public static void main(String[] args) {
        P p=new P();
        p.f1();
        p.f2();

       // I i =new I(); //Direct cannot create instance of interface

    }
}

class P implements I{
    @Override
    public void f1(){
        System.out.println("P class is completed f1 in I class");
    }

    @Override
    public void f2(){
        System.out.println("P class is completed f2 in I class");
    }
}

interface I{
    void f1();
    void f2();
    //void f3();

}