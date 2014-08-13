package pro_spring.ch4.xml.injection;

import pro_spring.ch4.Oracle;
import pro_spring.ch4.xml.XmlContextProvider;

/**
 * @author Alexandr Jelimalai
 */
public class InjectRefMain {

    private Oracle oracle;


    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }


    public static void main(String[] args) {
        InjectRefMain injectRef = (InjectRefMain)XmlContextProvider.getContext().getBean("injectRef");
        System.out.println(injectRef);
    }


    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}
