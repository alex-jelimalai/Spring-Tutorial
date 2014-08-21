package pro_spring.ch5.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * This bean demonstrate the calling of init method when the bean is created
 * 
 * @author Alexandr Jelimalai
 */
public class SimpleBeanWithInitMethod {

    private static final String DEFAULT_NAME = "Luke Skywalker";
    private String name = null;
    private int age = Integer.MIN_VALUE;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void init() {
        System.out.println("Initialization method");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBeanWithInitMethod.class);
        }
    }


    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }


    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/initMethod.xml");
        ctx.refresh(); // Refresh the ApplicationContext after XML config file loaded
        SimpleBeanWithInitMethod simpleBean1 = getBean("simpleBean1", ctx);
        SimpleBeanWithInitMethod simpleBean2 = getBean("simpleBean2", ctx);
        SimpleBeanWithInitMethod simpleBean3 = getBean("simpleBean3", ctx);
    }


    private static SimpleBeanWithInitMethod getBean(String beanName, ApplicationContext ctx) {
        try {
            SimpleBeanWithInitMethod bean = (SimpleBeanWithInitMethod)ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: " + ex.getMessage());
            return null;
        }
    }
}
