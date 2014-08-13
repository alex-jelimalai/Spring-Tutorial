package pro_spring.ch4.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro_spring.ch2.MessageProvider;
import pro_spring.ch2.MessageRenderer;

/**
 * @author Alexandr Jelimalai
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;
    private MessageProvider configurableMessageProvider;


    @Override
    public void render() {
        if (messageProvider == null || configurableMessageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider and configurableMessageProvider of class: " + getClass().getName());
        }
        System.out.println(messageProvider.getMessage());
        System.out.println(configurableMessageProvider.getMessage());
    }


    @Autowired
    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }


    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }


    @Resource(name = "configurableMessageProvider")
    public void setConfigurableMessageProvider(MessageProvider configurableMessageProvider) {
        this.configurableMessageProvider = configurableMessageProvider;
    }
}
