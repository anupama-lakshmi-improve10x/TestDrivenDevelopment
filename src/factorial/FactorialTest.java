package factorial;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenLessThanOrEqualToZero_returnNegativeNumber() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(0);
        assertEquals(-1, negativeNumber);
    }

    @Test
    public void givenOne_returnOne() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(1);
        assertEquals(1,negativeNumber);
    }

    @Test
    public void givenFive_return120() {
        Factorial factorial = new Factorial();
        int negativeNumber = factorial.findFactorial(5);
        assertEquals(120,negativeNumber);
    }

}
