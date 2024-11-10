package Oct.ex_14102024;

public class ChromeTC extends BaseClass {

    @Override
    void openBrowser(String browser){
        System.out.println("Open the chrome");
    }


    @Override
    void closeBrowser(String browser){
        System.out.println("close the chrome");
    }
}
