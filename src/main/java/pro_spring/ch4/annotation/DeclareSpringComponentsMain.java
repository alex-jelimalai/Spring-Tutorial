package pro_spring.ch4.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import pro_spring.ch2.MessageRenderer;

/**
 * @author Alexandr Jelimalai
 */
public class DeclareSpringComponentsMain {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:pro_spring/ch4/app-context-annotation.xml");
        context.refresh();
        MessageRenderer messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
