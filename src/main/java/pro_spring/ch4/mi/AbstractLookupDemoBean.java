package pro_spring.ch4.mi;

/**
 * @author Alexandr Jelimalai
 */
public abstract class AbstractLookupDemoBean implements DemoBean {

    public abstract MyHelper getMyHelper();


    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
