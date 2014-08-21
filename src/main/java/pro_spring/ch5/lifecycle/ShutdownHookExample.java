package pro_spring.ch5.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * This example demonstrates the automatic destroy of the bean once the context is registered to shutDownHook
 * 
 * @author Alexandr Jelimalai
 */
public class ShutdownHookExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/disposeInterface.xml");
        ctx.registerShutdownHook();
        ctx.refresh();
        DestructiveBeanWithDestroyInterface bean = (DestructiveBeanWithDestroyInterface)ctx.getBean("destructiveBean");
    }
}
