package pro_spring.ch4.annotation.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static pro_spring.ch4.annotation.AnnotationContextProvider.getContext;

/**
 * @author Alexandr Jelimalai
 */
@Service("injectSimpleSpel")
public class InjectSimpleSpelMain {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;


    @Value("#{injectSimpleConfig.name}")
    public void setName(String name) {
        this.name = name;
    }


    @Value("#{injectSimpleConfig.age}")
    public void setAge(int age) {
        this.age = age;
    }


    @Value("#{injectSimpleConfig.height}")
    public void setHeight(float height) {
        this.height = height;
    }


    @Value("#{injectSimpleConfig.programmer}")
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }


    @Value("#{injectSimpleConfig.ageInSeconds}")
    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }


    @Override
    public String toString() {
        return "InjectSimpleSpelMain{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", programmer=" + programmer + ", ageInSeconds=" +
               ageInSeconds + '}';
    }


    public static void main(String[] args) {
        InjectSimpleSpelMain injectSimple = (InjectSimpleSpelMain)getContext().getBean("injectSimpleSpel");
        System.out.println(injectSimple);
    }
}
