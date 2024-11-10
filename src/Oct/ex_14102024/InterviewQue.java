package Oct.ex_14102024;

public class InterviewQue {
}
interface I4{ //possible
    int age=10;  //it is final cannot change
}
interface  I5{}  //possible

class A{} //possible it is concrete
class B{} //possible it is concrete

class test1 extends A{} //possible Single inheritence
//class test2 extends A,B{} // not possible multiple inheritence

class test3 implements I4{} //pssible single inheritence using interface
class test4 implements I4,I5{} //possible multiple inheritence possible through inheritence

class test5 extends A implements I4,I5{} //possible one class inherit and multiple interface inherits
//class test6 implements I4 extends A{} //not possible bcz extends comes first not implement


abstract class AAA{
    AAA(){
        System.out.println("default constructors");
    }
}   //can create constructor in abstract

interface III{
//    III(){
//        System.out.println("default constructors");
//    }
}    //cannot create constructor in interface


