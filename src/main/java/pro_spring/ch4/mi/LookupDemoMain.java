package pro_spring.ch4.mi;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @author Alexandr Jelimalai
 */
public class LookupDemoMain {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch4/lookup.xml");
        ctx.refresh();
        DemoBean abstractBean = (DemoBean) ctx.getBean("abstractLookupBean");
        DemoBean standardBean = (DemoBean) ctx.getBean("standardLookupBean");
        displayInfo(standardBean);
        displayInfo(abstractBean);
    }


    public static void displayInfo(DemoBean bean) {
        MyHelper helper1 = bean.getMyHelper();
        MyHelper helper2 = bean.getMyHelper();
        System.out.println("Helper Instances the Same?: "
                           + (helper1 == helper2));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++) {
            MyHelper helper = bean.getMyHelper();
            helper.doSomethingHelpful();
        }
        stopWatch.stop();
        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }

}
