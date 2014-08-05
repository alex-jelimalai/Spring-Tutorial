package pro_spring.ch2;

/**
 * @author Alexandr Jelimalai
 */
public class Main {

    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
