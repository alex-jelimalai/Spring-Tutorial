package pro_spring.ch4.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class XmlContextProvider {

    private GenericXmlApplicationContext context;
    private static XmlContextProvider instance;


    private XmlContextProvider() {
        GenericXmlApplicationContext parentContext = new GenericXmlApplicationContext();
        parentContext.load("classpath:pro_spring/ch4/parent.xml");
        parentContext.refresh();
        context = new GenericXmlApplicationContext();
        context.load("classpath:pro_spring/ch4/app-context-xml.xml");
        context.setParent(parentContext);
        context.refresh();
    }


    public static GenericXmlApplicationContext getContext() {
        if (instance == null) {
            instance = new XmlContextProvider();
        }
        return instance.context;
    }
}
