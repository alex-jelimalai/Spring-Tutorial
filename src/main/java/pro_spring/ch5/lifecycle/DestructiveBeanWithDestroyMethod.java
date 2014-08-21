package pro_spring.ch5.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class DestructiveBeanWithDestroyMethod {

    public String filePath = null;


    public void destroy() {
        System.out.println("Destroying Bean");
    }


    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/disposeMethod.xml");
        ctx.refresh(); // Refresh the ApplicationContext after XML config file loaded
        DestructiveBeanWithDestroyMethod bean = (DestructiveBeanWithDestroyMethod)ctx.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        ctx.destroy();
        System.out.println("Called destroy()");
    }
}
