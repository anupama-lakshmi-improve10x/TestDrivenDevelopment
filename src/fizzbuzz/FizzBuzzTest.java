package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void nothing(){

    }

    @Test
    public void givenNegative_returnNegativeNumber() {
        String result = fizzBuzz.findFizzBuzz(-5);
        assertEquals("-1", result);

    }

    @Test
    public void givenZero_returnEmpty() {
        String result = fizzBuzz.findFizzBuzz(0);
        assertEquals("-1", result);
    }

    @Test
    public void givenThree_returnFizz() {
        String result = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void givenFive_returnBuzz() {
        String result = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void givenThreeFive_returnFizzBuzz() {
        String result = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void givenNumberEitherMultipleOfThreeOrFive_returnNumber() {
        String result = fizzBuzz.findFizzBuzz(4);
        assertEquals("4", result);

    }

    @Test
    public void givenTwoDigitNumber_returnFizz() {
        String result = fizzBuzz.findFizzBuzz(18);
        assertEquals("Fizz", result);
    }

    @Test
    public void givenTwoDigitNumber_returnNumber() {
        String result = fizzBuzz.findFizzBuzz(22);
        assertEquals("22", result);
    }
}
