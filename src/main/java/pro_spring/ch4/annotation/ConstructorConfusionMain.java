package pro_spring.ch4.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static pro_spring.ch4.annotation.AnnotationContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
@Service("constructorConfusion")
public class ConstructorConfusionMain {

    private final String someValue;


    public ConstructorConfusionMain(String someValue) {
        System.out.println("Constructor(String) called");
        this.someValue = someValue;
    }


    @Autowired
    public ConstructorConfusionMain(@Value("70") int someValue) {
        System.out.println("Constructor(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }


    public static void main(String[] args) {
        ConstructorConfusionMain cc = getContext().getBean("constructorConfusion", ConstructorConfusionMain.class);
        System.out.println(cc);
    }


    @Override
    public String toString() {
        return someValue;
    }
}
