package pro_spring.ch4.mi;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @author Alexandr Jelimalai
 */
public class MethodReplacementExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:pro_spring/ch4/replacement.xml");
        context.refresh();

        ReplacementTarget replacementTarget = context.getBean("replacementTarget", ReplacementTarget.class);
        ReplacementTarget standardTarget = context.getBean("standardTarget", ReplacementTarget.class);

        displayInfo(replacementTarget);
        displayInfo(standardTarget);
    }


    private static void displayInfo(ReplacementTarget target) {
        System.out.println(target.formatMessage("Hello World!"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for (int x = 0; x < 1000000; x++) {
            String out = target.formatMessage("foo");
        }
        stopWatch.stop();
        System.out.println("1000000 invocations took: " + stopWatch.getTotalTimeMillis() + " ms");
    }

}
