package pro_spring.ch4;

/**
 * @author Alexandr Jelimalai
 */
public class EncyclopediaImpl implements Encyclopedia {

    @Override
    public String findMeaningOfLife() {
        return "People use encyclopedias if they have not access to internet";
    }
}
