package pro_spring.ch4.annotation;

import org.springframework.stereotype.Service;

import pro_spring.ch2.MessageProvider;

/**
 * @author Alexandr Jelimalai
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World with annotation!";
    }
}
