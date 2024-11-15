package Oct.ex_11102024.encapuslation;

public class ICICIBank {

    private String name;
    private long bal;


    //Parameterized constructors
    public ICICIBank(String name,long bal){
         this.name=name;
         this.bal=bal;
    }

   //getter and setter

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public long getBal(){
        return bal;
    }
    public void setBal(long bal , boolean isAdmin){
        if (isAdmin){
            this.bal=bal;
        }else{
            System.out.println("not allowed");
        }
    }
}
