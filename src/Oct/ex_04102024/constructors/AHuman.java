package Oct.ex_04102024.constructors;

public class  AHuman {

       String eyes_color;
       String planet="AHuman";
       String name;
       long aadhar;

       //default constructor
       AHuman(){
           System.out.println("I will be called,object is created ");
           //write a code here which will automatically called when object is created
           //Read a file text
           //Read a csv file excel file
       }

      //Paramiterized constructor
        AHuman(String name){
            System.out.println("i am Paramiterized constructor");
            this.name=name;
       }



        void walk(){
           System.out.println("no return no argument");
       }

       int talk(){
           System.out.println("Return type with no argument");
           return 10;
       }

       String sleep (String name) {
           System.out.println("i am sleeping");
           System.out.println("Return type with argument");
           return "i am sleeping";
       }

       void eat (String name){
           System.out.println("Eat");
           System.out.println("no return type with argument");
       }


    }


