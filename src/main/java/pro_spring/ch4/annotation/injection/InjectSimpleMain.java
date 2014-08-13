package pro_spring.ch4.annotation.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static pro_spring.ch4.annotation.AnnotationContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
@Service("injectSimple")
public class InjectSimpleMain {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;


    @Value("John Smith")
    public void setName(String name) {
        this.name = name;
    }


    @Value("35")
    public void setAge(int age) {
        this.age = age;
    }


    @Value("1.78")
    public void setHeight(float height) {
        this.height = height;
    }


    @Value("true")
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }


    @Value("1234567489")
    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }


    @Override
    public String toString() {
        return "InjectSimpleMain{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", programmer=" + programmer + ", ageInSeconds=" +
               ageInSeconds + '}';
    }


    public static void main(String[] args) {
        InjectSimpleMain injectSimple = (InjectSimpleMain)getContext().getBean("injectSimple");
        System.out.println(injectSimple);
    }
}
