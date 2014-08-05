package pro_spring.ch2.impl;

import pro_spring.ch2.MessageProvider;

/**
 * @author Alexandr Jelimalai
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello Message";
    }
}
