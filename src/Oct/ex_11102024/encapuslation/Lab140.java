package Oct.ex_11102024.encapuslation;

public class Lab140 {
    public static void main(String[] args) {
        VWOLogin vwoLogin =new VWOLogin("sonamverma","sonam123");
        System.out.println(vwoLogin.password);
        vwoLogin.password="hacker123";
        System.out.println(vwoLogin.password);  //easily accessible by object creation because
        ///it is public and change by hacker so it is wrong

       //Good example
        GoodExVWOLogin vwoLogin1=new GoodExVWOLogin("sonam346","Sonamverma1");
        //System.out.println(vwoLogin1.password);
        //not accessible by object bcz it is encapsulated private

        System.out.println(vwoLogin1.getPassword());
        //checking the condition if Admin then changed the password if not pass is same
        boolean isAdmin=false;
        vwoLogin1.setPassword("Sonam678494",isAdmin);
        System.out.println(vwoLogin1.getPassword());

        System.out.println(vwoLogin1.getUserName());
        vwoLogin1.setYourKey("Sonamvermasopra");
        System.out.println(vwoLogin1.getUserName());
    }
}
