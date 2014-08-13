package pro_spring.ch4.annotation.injection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import static pro_spring.ch4.annotation.AnnotationContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
@Service("injectionCollection")
public class CollectionInjectionMain {

    @Resource(name = "map")
    private Map<String, Object> map;
    @Resource(name = "props")
    private Properties props;
    @Resource(name = "set")
    private Set set;
    @Resource(name = "list")
    private List list;


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
