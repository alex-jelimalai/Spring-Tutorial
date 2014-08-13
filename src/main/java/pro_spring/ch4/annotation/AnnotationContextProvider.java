package pro_spring.ch4.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class AnnotationContextProvider {

    private GenericXmlApplicationContext context;
    private static AnnotationContextProvider instance;


    private AnnotationContextProvider() {
        context = new GenericXmlApplicationContext();
        context.load("classpath:pro_spring/ch4/app-context-annotation.xml");
        context.refresh();
    }


    public static GenericXmlApplicationContext getContext() {
        if (instance == null) {
            instance = new AnnotationContextProvider();
        }
        return instance.context;
    }
}
