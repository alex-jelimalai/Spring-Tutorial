package pro_spring.ch4.xml;

import pro_spring.ch2.MessageProvider;

/**
 * @author Alexandr Jelimalai
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World with XML";
    }
}
