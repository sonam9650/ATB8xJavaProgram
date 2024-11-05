package Oct.ex_11102024.superkeyword.nnewex;

public class BaseClass {
    private String browser;


    //default constructors
    BaseClass(){
        System.out.println("DC-Base Class");
    }

    //Parameterized constructors
    BaseClass(String b){
        System.out.println("PC-Base Class");
    }

    //Getter and Setter
    public String getBrowser(){
        return browser;
    }

    //is authorized if else condition
    public void setBrowser(String browser,boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

     // more functions regarding browsers (Method overloading in open browser)
     void openBrowser(){
            System.out.println("Chrome Browser");
        }

     void openBrowser(String browserName){
         System.out.println("Open Browser->"+ browserName);
     }
     void closeBrowser(){
         System.out.println("close browser");
     }
 }

