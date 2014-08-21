package pro_spring.ch5.interaction;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class ShutdownHookBean implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext instanceof GenericApplicationContext) {
            ((GenericApplicationContext)applicationContext).registerShutdownHook();
        }
    }
}
