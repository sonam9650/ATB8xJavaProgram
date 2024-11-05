package Oct.ex_11102024.Task;

public class TestCaseAPI extends BaseTestAPI {

    public TestCaseAPI(){
        super("vivek",4567);  //Call the BaseTestAPI PC
        //super();   //also can Call the BaseTestAPI DC
        this.setName("sonam");
        this.setId(1256,true);         //override behaviour setId
        this.performGET(" verma ",2345);  //override behaviour performGET
    }

    //Override behaviour
    @Override
    void performGET(String name,int id){
        super.performGET(name,id);
    }

    @Override
    public void setId(int id, boolean isAuth) {
        super.setId(id, isAuth);
    }


}
