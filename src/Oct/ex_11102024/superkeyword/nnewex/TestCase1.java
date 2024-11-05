package Oct.ex_11102024.superkeyword.nnewex;

public class TestCase1 extends BaseClass{
    //testcase is a type of base class-Single inheritence

    TestCase1 (){
        super();
        this.setBrowser("edge",true);// default constructor of parent
    }

    @Override
    public void setBrowser(String browser,boolean isAuth) {
        super.setBrowser(browser,isAuth);
    }
}
