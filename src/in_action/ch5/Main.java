package in_action.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("in_action/ch5/beans.xml");
        SpitterDao spitterDao = (SpitterDao)context.getBean("spitterDao");
        spitterDao.addSpitterOldWay(createSpitter("Alexandr"));
        spitterDao.addSpitter(createSpitter("Ada"));

        Spitter spitterFromSelect = spitterDao.getSpitterById(1);
        System.out.println(spitterFromSelect);

    }


    private static Spitter createSpitter(String name) {
        Spitter spitter = new Spitter();
        spitter.setFullName(name);
        spitter.setUserName(name);
        spitter.setPassword("pass");
        spitter.setEmail(name + "@mail.ru");
        return spitter;
    }

}
