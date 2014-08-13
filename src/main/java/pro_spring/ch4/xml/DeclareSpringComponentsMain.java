package pro_spring.ch4.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import pro_spring.ch2.MessageRenderer;

/**
 * @author Alexandr Jelimalai
 */
public class DeclareSpringComponentsMain {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:pro_spring/ch4/app-context-xml.xml");
        context.refresh();
        MessageRenderer messageRenderer = context.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();

        MessageRenderer messageRendererForConfigMessageProvider = context.getBean("messageRendererForConfigMessageProvider", MessageRenderer.class);
        messageRendererForConfigMessageProvider.render();
    }
}
