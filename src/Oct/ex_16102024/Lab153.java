package Oct.ex_16102024;

public class Lab153 {
    public static void main(String[] args) {
        ATB s1=new ATB("Sonam");
        ATB s2=new ATB("vivek");
        ATB s3=new ATB("kusum");
        ATB s4=new ATB("Umesh");
        ATB s5;
        new ATB("Amit");

        s1.readDocuments(); //in instance variable different in nature (attribute and behaviour)
        s2.readDocuments();
        s3.readDocuments();//it is called without the class name

        ATB.doAssignment(); //in static variable common in nature for all and it is called with the class name

     }

}

class ATB{
    {
        System.out.println("IIB");
        //what is the purpose
        //Here you can write code related to start a website or
        //anything before starting the web automation and api automation
        System.out.println("Read from CSV file");
    }

    static{
        System.out.println("SIB");
        System.out.println("load a class.. i will executed");
    }

    private String name;
    private long phoneNo;
    static String courseName="ATB8x";

//Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public ATB(String name){
        this.name=name;         //parameterized constructor

    }

    void readDocuments(){
        System.out.println(courseName); //can use static function variable in non static function
        System.out.println("non static method");
    }

    static void doAssignment(){
        //System.out.println(phone);  //cant use instance variable in static
        System.out.println("static method do assignment");
    }

    static class genAI{
        //0.001% use in automation
    }

}
