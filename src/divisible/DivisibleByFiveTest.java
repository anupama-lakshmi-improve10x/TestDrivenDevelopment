package divisible;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class DivisibleByFiveTest {

    private DivisibleByFive divisibleByFive;

    @BeforeEach

    public void setup() {
        divisibleByFive = new DivisibleByFive();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNegativeNumberDivisibleBy5_returnTrue() {
        boolean result = divisibleByFive.isDivisible(-55);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberZeroDivisibleBy5_returnTrue() {
        boolean result = divisibleByFive.isDivisible(0);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberOneDivisibleBy5_returnFalse(){
        boolean result = divisibleByFive.isDivisible(1);
        assertEquals(false, result);
    }


    @Test
    public void givenNumberNotDivisibleBy5_returnFalse() {
        boolean result = divisibleByFive.isDivisible(27);
        assertEquals(false, result);
    }


    @Test
    public void givenNumberDivisibleBy5_returnTrue() {
        boolean result = divisibleByFive.isDivisible(5);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberTwoDigitNumber_returnTrue() {
        boolean result = divisibleByFive.isDivisible(15);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberThreeDigitNumber_returnTrue() {
        boolean result = divisibleByFive.isDivisible(200);
        assertEquals(true,result);
    }

    @Test
    public void givenNumber_returnFalse() {
        boolean result = divisibleByFive.isDivisible(222);
        assertEquals(false,result);

    }
}
