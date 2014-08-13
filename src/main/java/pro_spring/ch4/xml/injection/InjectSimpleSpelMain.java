package pro_spring.ch4.xml.injection;

import static pro_spring.ch4.xml.XmlContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
public class InjectSimpleSpelMain {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setHeight(float height) {
        this.height = height;
    }


    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }


    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }


    @Override
    public String toString() {
        return "InjectSimpleSpelMain{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", programmer=" + programmer + ", ageInSeconds=" +
               ageInSeconds + '}';
    }


    public static void main(String[] args) {
        InjectSimpleSpelMain injectSimple = getContext().getBean("injectSimpleSpel", InjectSimpleSpelMain.class);
        System.out.println(injectSimple);
    }
}
