package pro_spring.ch4;

/**
 * @author Alexandr Jelimalai
 */
public class SetterInjection {

    private Dependency dependency;


    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
