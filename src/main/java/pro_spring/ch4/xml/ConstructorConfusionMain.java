package pro_spring.ch4.xml;

import static pro_spring.ch4.xml.XmlContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class ConstructorConfusionMain {

    private final String someValue;


    public ConstructorConfusionMain(String someValue) {
        System.out.println("Constructor(String) called");
        this.someValue = someValue;
    }


    public ConstructorConfusionMain(int someValue) {
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
