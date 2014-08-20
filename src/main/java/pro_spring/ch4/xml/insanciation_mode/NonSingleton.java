package pro_spring.ch4.xml.insanciation_mode;

import pro_spring.ch4.xml.XmlContextProvider;

/**
 * @author Alexandr Jelimalai
 */
public class NonSingleton {

    public static void main(String[] args) {
        String s1 = (String)XmlContextProvider.getContext().getBean("nonSingleton");
        String s2 = (String)XmlContextProvider.getContext().getBean("nonSingleton");
        System.out.println("Identity Equal?: " + (s1 ==s2));
        System.out.println("Value Equal:? " + s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
