package pro_spring.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Alexandr Jelimalai
 */
public class HierarchicalAppContextUsageMain {

    public static void main(String[] args) {
        GenericXmlApplicationContext parentContext = new GenericXmlApplicationContext();
        parentContext.load("classpath:pro_spring/ch4/parent.xml");
        parentContext.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:pro_spring/ch4/app-context-xml.xml");
        child.setParent(parentContext);
        child.refresh();

        SimpleTarget target1 = child.getBean("target1", SimpleTarget.class);
        SimpleTarget target2 = child.getBean("target2", SimpleTarget.class);
        SimpleTarget target3 = child.getBean("target3", SimpleTarget.class);

        System.out.println(target1.getVal());
        System.out.println(target2.getVal());
        System.out.println(target3.getVal());
    }
}
