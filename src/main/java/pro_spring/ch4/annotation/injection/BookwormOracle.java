package pro_spring.ch4.annotation.injection;

import org.springframework.stereotype.Service;

import pro_spring.ch4.Encyclopedia;
import pro_spring.ch4.Oracle;

/**
 * @author Alexandr Jelimalai
 */
@Service("oracle")
public class BookwormOracle implements Oracle {

    private Encyclopedia encyclopedia;


    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use Internet";
    }

}
