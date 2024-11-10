package Oct.ex_14102024;

public class BaseClass extends GrandBaseClass{
    //web automation
    //single
    //hide the functionality of the open and close browser


    void openBrowser (String browser){
    }

    void closeBrowser (String browser){

    }

    @Override
    void takeScreenshot() {
        System.out.println("Taking screenshot");
    }
}
