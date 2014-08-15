package pro_spring.ch4.theory;

/**
 * @author Alexandr Jelimalai
 */
public class ContextualizedDependencyLookup implements ManagedComponent {

    private Dependency dependency;


    @Override
    public void performLookup(Container container) {
        dependency = (Dependency)container.getDependency("myDependency");
    }
}
