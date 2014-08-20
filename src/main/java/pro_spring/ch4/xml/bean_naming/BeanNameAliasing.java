package pro_spring.ch4.xml.bean_naming;

import java.util.Arrays;

import static pro_spring.ch4.xml.XmlContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class BeanNameAliasing {

    public static void main(String[] args) {
        String s1 = (String)getContext().getBean("name1");
        String s2 = (String)getContext().getBean("name2");
        String s3 = (String)getContext().getBean("name3");
        String s4 = (String)getContext().getBean("name4");
        String s5 = (String)getContext().getBean("name5");
        String s6 = (String)getContext().getBean("name6");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(Arrays.asList(getContext().getAliases("name5")));

    }
}
