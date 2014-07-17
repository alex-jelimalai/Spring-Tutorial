package in_action.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... arg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("in_action/ch4/beans.xml");

        Singer singer = (Singer)context.getBean("voice");
        singer.play();

    }

}