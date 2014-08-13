package pro_spring.ch4.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro_spring.ch2.MessageProvider;

/**
 * @author Alexandr Jelimalai
 */
@Service("configurableMessageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private final String message;


    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
