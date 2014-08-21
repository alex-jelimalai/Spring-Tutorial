package pro_spring.ch5.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * The bean demonstrate the calling of method annotated with @PostConstruct.
 * 
 * @author Alexandr Jelimalai
 */
public class SimpleBeanWithAnnotatedInitMethod {

    private static final String DEFAULT_NAME = "Luke Skywalker";
    private String name = null;
    private int age = Integer.MIN_VALUE;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @PostConstruct
    public void init() {
        System.out.println("Initialization method");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBeanWithAnnotatedInitMethod.class);
        }
    }


    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }


    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/initAnnotation.xml");
        ctx.refresh();
        SimpleBeanWithAnnotatedInitMethod simpleBean1 = getBean("simpleBean1", ctx);
        SimpleBeanWithAnnotatedInitMethod simpleBean2 = getBean("simpleBean2", ctx);
        SimpleBeanWithAnnotatedInitMethod simpleBean3 = getBean("simpleBean3", ctx);
    }


    private static SimpleBeanWithAnnotatedInitMethod getBean(String beanName, ApplicationContext ctx) {
        try {
            SimpleBeanWithAnnotatedInitMethod bean = (SimpleBeanWithAnnotatedInitMethod)ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occured in bean configuration: " + ex.getMessage());
            return null;
        }
    }
}
