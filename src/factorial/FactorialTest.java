package factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach

    public void setup() {
        factorial = new Factorial();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeFactorial_returnNegativeNumber() {
        int negativeNumber = factorial.findFactorial(-10);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenFactorialNegativeOne_returnNegativeNumber() {
        int negativeNumber = factorial.findFactorial(-1);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenZeroFactorial_returnZero() {
        int ZeroNumber = factorial.findFactorial(0);
        assertEquals(1, ZeroNumber);
    }

    @Test
    public void givenOneFactorial_returnOne() {
        int number = factorial.findFactorial(1);
        assertEquals(1,number);
    }

    @Test
    public void givenTwoFactorial_returnTwo() {
        int result = factorial.findFactorial(2);
        assertEquals(2,result);
    }

    @Test
    public void givenFourFactorial_returnTwentyFour() {
        int result = factorial.findFactorial(4);
        assertEquals(24, result);
    }

    @Test
    public void givenFiveFactorial_returnOneHundredTwenty() {
        int result = factorial.findFactorial(5);
        assertEquals(120, result);
    }

}
