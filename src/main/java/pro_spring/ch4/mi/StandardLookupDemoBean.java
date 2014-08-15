package pro_spring.ch4.mi;

/**
 * @author Alexandr Jelimalai
 */
public class StandardLookupDemoBean implements DemoBean {

    private MyHelper myHelper;


    public void setMyHelper(MyHelper myHelper) {
        this.myHelper = myHelper;
    }


    @Override
    public MyHelper getMyHelper() {
        return myHelper;
    }


    @Override
    public void someOperation() {
        myHelper.doSomethingHelpful();
    }
}
