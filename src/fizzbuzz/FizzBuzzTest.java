package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing(){

    }

    @Test
    public void givenZero_returnEmpty() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(0);
        assertEquals("-1", result);
    }

    @Test
    public void givenThree_returnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void givenFive_returnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void givenThreeFive_returnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void givenNumberEitherMultipleOfThreeOrFive_returnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(4);
        assertEquals("4", result);

    }
}
