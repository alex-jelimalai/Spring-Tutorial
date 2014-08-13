package pro_spring.ch4.annotation;

import pro_spring.ch2.MessageRenderer;
import static pro_spring.ch4.annotation.AnnotationContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class DeclareSpringComponentsMain {

    public static void main(String[] args) {
        MessageRenderer messageRenderer = getContext().getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
