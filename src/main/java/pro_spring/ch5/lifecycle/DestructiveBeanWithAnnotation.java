package pro_spring.ch5.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class DestructiveBeanWithAnnotation {

    public String filePath = null;


    public void destroy() {
        System.out.println("Destroying Bean");
    }


    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public static void main(String[] args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:pro_spring/ch5/lifecycle/disposeAnnotation.xml");
        ctx.refresh();
        DestructiveBeanWithAnnotation bean = (DestructiveBeanWithAnnotation)ctx.getBean("destructiveBean");
        System.out.println("Calling destroy()");
        ctx.destroy();
        System.out.println("Called destroy()");
    }
}
