package highernumber;

import org.junit.jupiter.api.Test;

public class HigherNumber {

    public boolean existsHigher(int[] numbers,  int n) {
        boolean result = false;
        if(numbers.length == 0) {
            result = false;
        } else {
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] >= n) {
                    result = true;
                }
            }
        }
        return result;
    }
}
