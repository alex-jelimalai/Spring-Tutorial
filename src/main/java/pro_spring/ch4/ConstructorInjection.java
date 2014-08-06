package pro_spring.ch4;

/**
 * @author Alexandr Jelimalai
 */
public class ConstructorInjection {

    private Dependency dependency;


    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
}
