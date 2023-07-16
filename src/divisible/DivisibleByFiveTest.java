package divisible;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class DivisibleByFiveTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNumberNotDivisibleBy5_returnFalse() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.divisible(27);
        assertEquals(false, result);
    }

    @Test
    public void givenNumberZeroDivisibleBy5_returnTrue() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.divisible(0);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberOneDivisibleBy5_returnFalse(){
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.divisible(1);
        assertEquals(false, result);
    }

    @Test
    public void givenNegativeNumberDivisibleBy5_returnTrue() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.divisible(-55);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberDivisibleBy5_returnTrue() {
        DivisibleByFive divisibleByFive = new DivisibleByFive();
        boolean result = divisibleByFive.divisible(5);
        assertEquals(true, result);
    }
}
