package pro_spring.ch4.xml;

import pro_spring.ch2.MessageProvider;

/**
 * @author Alexandr Jelimalai
 */
public class ConfigurableMessageProvider implements MessageProvider {

    private final String message;


    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
