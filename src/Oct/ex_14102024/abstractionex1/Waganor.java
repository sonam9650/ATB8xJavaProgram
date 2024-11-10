package Oct.ex_14102024.abstractionex1;

public class Waganor extends Engine {

    void drive(){
        startEngine();
        stopEngine();
    }


    @Override
    void startEngine(){
        System.out.println("Starting the engine");
    }

    @Override
    void stopEngine(){
        System.out.println("Stoping the engine");
    }
}
