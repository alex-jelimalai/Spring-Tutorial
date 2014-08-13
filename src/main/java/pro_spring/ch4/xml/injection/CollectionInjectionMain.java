package pro_spring.ch4.xml.injection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import static pro_spring.ch4.xml.XmlContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class CollectionInjectionMain {

    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;


    public void setMap(Map<String, Object> map) {
        this.map = map;
    }


    public void setProps(Properties props) {
        this.props = props;
    }


    public void setSet(Set set) {
        this.set = set;
    }


    public void setList(List list) {
        this.list = list;
    }


    private void displayInfo() {
        System.out.println("Map contents\n");
        for (final Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }
        System.out.println("\nProps contents\n");
        for (final Entry<Object, Object> entry : props.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }

        System.out.println("\nSet contents\n");
        for (final Object o : set) {
            System.out.println("Value: " + o);
        }

        System.out.println("\nList Contents\n");
        for (final Object o : list) {
            System.out.println("Value: " + o);
        }

    }


    public static void main(String[] args) {
        CollectionInjectionMain collectionInjection = getContext().getBean("injectionCollection", CollectionInjectionMain.class);
        collectionInjection.displayInfo();
    }
}
