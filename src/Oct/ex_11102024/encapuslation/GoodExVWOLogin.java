package Oct.ex_11102024.encapuslation;

public class GoodExVWOLogin {
    private String userName;
    private String password;

    public GoodExVWOLogin(String password,String userName){
        this.password=password;
        this.userName=userName;

    }

    public String getUserName() {
        return userName;
    }

    public void  setYourKey (String userName) {    //setUserName optional name choose for confuse hackers
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }else {
            System.out.println("not allowed");
        }

    }
}
