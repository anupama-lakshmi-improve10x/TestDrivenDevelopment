package factorial;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeFactorial_returnNegativeNumber() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(-10);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenFactorialNegativeOne_returnNegativeNumber() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(-1);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenZeroFactorial_returnZero() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(0);
        assertEquals(1, negativeNumber);
    }

    @Test
    public void givenOneFactorial_returnOne() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(1);
        assertEquals(1,negativeNumber);
    }

    @Test
    public void givenTwoFactorial_returnTwo() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(2);
        assertEquals(2,negativeNumber);
    }

    @Test
    public void givenFourFactorial_returnTwentyFour() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(4);
        assertEquals(24,negativeNumber);
    }

    @Test
    public void givenFiveFactorial_returnOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(5);
        assertEquals(120,negativeNumber);
    }

}
