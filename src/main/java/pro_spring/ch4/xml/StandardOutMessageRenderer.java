package pro_spring.ch4.xml;

import pro_spring.ch2.MessageProvider;
import pro_spring.ch2.MessageRenderer;

/**
 * @author Alexandr Jelimalai
 */
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;


    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class: " + getClass().getName());
        }
        System.out.println(messageProvider.getMessage());
    }


    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }


    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
