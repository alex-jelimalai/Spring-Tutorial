package pro_spring.ch2;

/**
 * @author Alexandr Jelimalai
 */
public interface MessageRenderer {

    void render();


    void setMessageProvider(MessageProvider messageProvider);


    MessageProvider getMessageProvider();
}
