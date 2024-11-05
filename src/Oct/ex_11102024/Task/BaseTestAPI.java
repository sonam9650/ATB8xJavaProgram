package Oct.ex_11102024.Task;

public class BaseTestAPI {

    //method-attributes using encapsulation
   private String name;
   private int id;

 //default constructor
    BaseTestAPI(){
        System.out.println("i am DC-Base test");
    }

    // parameterized constructor
    BaseTestAPI(String name,int id){
        System.out.println("i am PC-Base test");
        this.name=name;
        this.id=id;
    }

    // getter for access encapsulation private attributes

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    //setter for access encapsulation private attributes
    public void setName(String name){
        this.name=name;
    }

    public void setId(int id,boolean isAuth){
        if (isAuth){
            this.id=id;
        }else{
            System.out.println("not authorised");
        }
    }

    //Behaviour
    void performGET(){
        System.out.println("Performing GET operation");
    }

    // Method overloading performGET
    void performGET(String name,int id) {
        System.out.println("Performing GET operation" + name + id);
    }

    void performPOST(){
        System.out.println("Performing POST operation");
    }

    void performPATCH(){
        System.out.println("Performing PATCH operation");
    }

    void performPUT(){
        System.out.println("Performing PUT operation");
    }

    void performDELETE(){
        System.out.println("Performing DELETE operation");
    }

}
