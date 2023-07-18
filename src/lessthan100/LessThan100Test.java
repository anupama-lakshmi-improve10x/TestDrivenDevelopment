package lessthan100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class LessThan100Test {
    LessThanHundred lessThanHundred;

    @BeforeEach
    public void setup() {
        lessThanHundred = new LessThanHundred();
    }

    @Test
    public void nothing(){
    }

    /*lessThan100(22, 15) ➞ true
    // 22 + 15 = 37

   lessThan100(83, 34) ➞ false
  // 83 + 34 = 117

    lessThan100(3, 77) ➞ true
*/

    @Test
    public void additionNegativeNumbersLessThan100_returnTrue() {
        boolean result = lessThanHundred.isLessThanHundred(-99, -1);
        assertEquals(true, result);
    }

    @Test
    public void additionNegativeNumberLessThan() {
        boolean result = lessThanHundred.isLessThanHundred(-98, -1);
        assertEquals(true, result);

    }

    @Test
    public void additionNegativeNumberMoreThan100_returnFalse() {
        boolean result = lessThanHundred.isLessThanHundred(-100, 2);
        assertEquals(true, result);
    }

    @Test
    public void additionZeroNumberLessThan100_returnTrue() {
        boolean result = lessThanHundred.isLessThanHundred(0, 0);
        assertEquals(true, result);
    }

    @Test
    public void additionTwoNumbersLessThan100_returnTrue() {
        boolean result = lessThanHundred.isLessThanHundred(22, 15);
        assertEquals(true, result);
    }

    @Test
    public void additionTwoNumbersMoreThan100_returnFalse() {
        boolean result = lessThanHundred.isLessThanHundred(83, 34);
        assertEquals(false, result);
    }






}
