package Oct.ex_16102024;

public class Lab151 {
    public static void main(String[] args) {
        Student s1=new Student(23);
        Student s2=new Student(27);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name); //not required of creating object
        Student.school_name="NFC School";
        System.out.println(Student.school_name);

    }

}

class Student{
    int age ; //instance variable (not static variable)
    static String school_name="SKV school";  //static variable

    {
        System.out.println("IIB");  //(IIB->Instance initialisation Block) is created when object is created
        System.out.println("here you can write a code what you want to do when object is created");
        System.out.println("Read a mySQL db");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded once when class is loaded");
    }


    public Student(int age){
        this.age=age;   //parameterized constructor
    }
}
