package pro_spring.ch5.interaction;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class LoggingBeanExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/interaction/logging.xml");
        ctx.refresh();

        LoggingBean loggingBean = (LoggingBean)ctx.getBean("loggingBean");
        loggingBean.someOperation();
    }
}
