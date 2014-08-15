package pro_spring.ch4.theory;

import pro_spring.ch4.theory.Dependency;

/**
 * @author Alexandr Jelimalai
 */
public class ConstructorInjection {

    private Dependency dependency;


    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
}
