package pro_spring.ch4.theory;

/**
 * @author Alexandr Jelimalai
 */
public interface NewsletterSender {

    void setSmtpServer(String stmpServer);


    String getSmtpServer();


    void setFromAddress(String fromAddress);


    String getFromAddress();


    void send();
}
