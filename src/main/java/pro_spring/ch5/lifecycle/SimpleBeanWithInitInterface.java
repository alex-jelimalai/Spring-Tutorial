package pro_spring.ch5.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import pro_spring.ch4.bean_inheritance.SimpleBean;

/**
 * The bean demonstrate the calling of afterProperties method.
 * 
 * @author Alexandr Jelimalai
 */
public class SimpleBeanWithInitInterface implements InitializingBean {

    private static final String DEFAULT_NAME = "Luke Skywalker";
    private String name = null;
    private int age = Integer.MIN_VALUE;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void myInit() {
        System.out.println("My Init");
    }


    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }


    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/initInterface.xml");
        ctx.refresh();
        SimpleBeanWithInitInterface simpleBean1 = getBean("simpleBean1", ctx);
        SimpleBeanWithInitInterface simpleBean2 = getBean("simpleBean2", ctx);
        SimpleBeanWithInitInterface simpleBean3 = getBean("simpleBean3", ctx);
    }


    private static SimpleBeanWithInitInterface getBean(String beanName, ApplicationContext ctx) {
        try {
            SimpleBeanWithInitInterface bean = (SimpleBeanWithInitInterface)ctx.getBean(beanName);
            System.out.println(bean);
            return bean;
        } catch (BeanCreationException ex) {
            System.out.println("An error occurred in bean configuration: " + ex.getMessage());
            return null;
        }
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");
        if (name == null) {
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBean.class);
        }
    }
}
