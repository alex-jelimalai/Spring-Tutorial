package pro_spring.ch4.xml;

import pro_spring.ch2.MessageRenderer;
import static pro_spring.ch4.xml.XmlContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class DeclareSpringComponentsMain {

    public static void main(String[] args) {
        MessageRenderer messageRenderer = getContext().getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();

        MessageRenderer messageRendererForConfigMessageProvider = getContext().getBean("messageRendererForConfigMessageProvider", MessageRenderer.class);
        messageRendererForConfigMessageProvider.render();
    }
}
