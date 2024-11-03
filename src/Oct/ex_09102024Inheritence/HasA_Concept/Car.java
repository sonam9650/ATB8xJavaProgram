package Oct.ex_09102024Inheritence.HasA_Concept;

public class Car {

    //car hasA engine and tyre
       void startCar(){
           new Engine().start();
           new Tyre().rolling();

       }

}
