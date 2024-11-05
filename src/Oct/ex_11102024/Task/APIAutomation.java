package Oct.ex_11102024.Task;

public class APIAutomation {
    public static void main(String[] args) {

        BaseTestAPI b =new TestCaseAPI();
        b.setId(3468,false);
        System.out.println(b.getId());
        b.performDELETE();
        b.performGET();
        b.performPATCH();
        b.performPUT();
        b.performPOST();
    }
}
