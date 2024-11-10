package Oct.ex_14102024;

public class Lab143 {
    //abstract class

    abstract class Loan{
        abstract void loan50k();          //incomplete method requires abstract class also
    }

    abstract class Loan3{}  // abstract class with no abstract method is valid

    abstract class Loan2{            //it can be both
        abstract void loan1l();        //incomplete method

        void loan1lakh(){               //complete function
            System.out.println("1 lakh loan");
        }
    }




    //Concrete classes no abstraction available

    class Person1{}
    class Person2{}
    class Person3{}
    class Person4{}
    class Person5{}
    
}
