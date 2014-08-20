package pro_spring.ch4.bean_inheritance;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class SimpleBean {

    public String name;
    public int age;


    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch4/inheritance.xml");
        ctx.refresh();
        SimpleBean parent = (SimpleBean)ctx.getBean("inheritParent");
        SimpleBean child = (SimpleBean)ctx.getBean("inheritChild");
        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age;
    }
}
