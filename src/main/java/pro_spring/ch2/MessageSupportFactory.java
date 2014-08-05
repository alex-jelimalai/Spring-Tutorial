package pro_spring.ch2;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Alexandr Jelimalai
 */
public class MessageSupportFactory {

    private static final MessageSupportFactory instance;
    private static MessageSupportFactory messageSupportFactory;
    private Properties props;

    private MessageRenderer messageRenderer;

    private MessageProvider messageProvider;

    static {
        instance = new MessageSupportFactory();

    }


    public static MessageSupportFactory getInstance() {
        return instance;
    }


    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream("src/main/resources/msf.properties"));
            String renderClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            messageRenderer = (MessageRenderer)Class.forName(renderClass).newInstance();
            messageProvider = (MessageProvider)Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }


    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
