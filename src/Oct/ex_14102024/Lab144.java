package Oct.ex_14102024;

public class Lab144 {

    public static void main(String[] args) {

        ChromeTC chromeTC = new ChromeTC();
        chromeTC.openBrowser("Chrome");
        chromeTC.closeBrowser("Chrome");
        chromeTC.takeScreenshot(); //hidden the functionality
        chromeTC.noBodyKnowsWhereIamPresent();


        FirefoxTC firefoxTC = new FirefoxTC();
        firefoxTC.openBrowser("Firefox");
        firefoxTC.closeBrowser("Firefox");
        firefoxTC.takeScreenshot(); //abstract from base class but dont know where it is
    }
}