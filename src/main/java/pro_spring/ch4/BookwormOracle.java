package pro_spring.ch4;

/**
 * @author Alexandr Jelimalai
 */
public class BookwormOracle implements Oracle {

    private Encyclopedia encyclopedia;


    @Override
    public String defineMeaningOfLife() {
        return encyclopedia.findMeaningOfLife();
    }


    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }
}
