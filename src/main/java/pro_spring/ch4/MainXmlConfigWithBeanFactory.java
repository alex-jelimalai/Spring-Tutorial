package pro_spring.ch4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Alexandr Jelimalai
 */
public class MainXmlConfigWithBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/pro_spring/ch4/xmlBeanFactory.xml"));

        Oracle oracle = (Oracle)factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
