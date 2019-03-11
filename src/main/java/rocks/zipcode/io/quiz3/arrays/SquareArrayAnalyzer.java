package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(input));
        List<Integer> squaredValuesList = new ArrayList<>(Arrays.asList(squaredValues));
        for (Integer i : inputList){
            if (squaredValuesList.contains(i * i)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
