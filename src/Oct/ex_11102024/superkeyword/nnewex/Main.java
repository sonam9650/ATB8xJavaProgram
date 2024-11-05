package Oct.ex_11102024.superkeyword.nnewex;

public class Main {
    public static void main(String[] args) {
        BaseClass t1=new TestCase1();//Dynamic dispatch
     t1.openBrowser("edge");//method overloading pass the parameter
     t1.closeBrowser();
    }
}
