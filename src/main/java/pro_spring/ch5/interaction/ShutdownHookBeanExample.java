package pro_spring.ch5.interaction;

import org.springframework.context.support.GenericXmlApplicationContext;

import pro_spring.ch5.lifecycle.DestructiveBeanWithDestroyInterface;

/**
 * @author Alexandr Jelimalai
 */
public class ShutdownHookBeanExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/interaction/shutdownHook.xml");
        ctx.refresh();

        DestructiveBeanWithDestroyInterface bean = (DestructiveBeanWithDestroyInterface)ctx.getBean("destructiveBean");
    }
}
