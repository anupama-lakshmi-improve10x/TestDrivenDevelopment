package highernumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ExistsHigherNumberTest {

    private  HigherNumber higherNumber;
   @BeforeEach
    public void setup() {
       higherNumber = new HigherNumber();
   }

    @Test
    public void nothing() {

    }

    @Test
    public void givenArrayIsNegative_returnFalse() {
        boolean result = higherNumber.existsHigher(new int[]{-1,-2,-8,-11, -29}, -11);
        assertEquals(true, result);
    }

    @Test
    public void givenArrayIsEmpty_returnFalse() {
        HigherNumber higherNumber = new HigherNumber();
        boolean result = higherNumber.existsHigher(new int[]{}, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenNumberIsLargerNumber_returnTrue() {
        HigherNumber higherNumber = new HigherNumber();
        boolean result = higherNumber.existsHigher(new int[]{5, 3, 15, 22, 4}, 10);
        assertEquals(true, result);

    }

    @Test
    public void givenNumberIsEqual_returnTrue() {
        HigherNumber higherNumber = new HigherNumber();
        boolean result = higherNumber.existsHigher(new int[] {4, 3, 3, 3, 2, 2, 2}, 4);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberIsNotEqualOrGreaterThan_returnFalse() {
        HigherNumber higherNumber = new HigherNumber();
        boolean result = higherNumber.existsHigher(new int[] {1, 2, 3, 4, 5}, 8);
        assertEquals(false, result);
    }
}
