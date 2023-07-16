package twomakesten;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class TwoMakesTenTest {

    @Test
    public void nothing() {

    }

    /*
    makesTen(9, 10) ➞ true

    makesTen(9, 9) ➞ false

    makesTen(1, 9) ➞ true

     */

    @Test
    public void givenNumbersZero_returnFalse() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(0, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenNumberNegativeNumberAndOne_returnFalse() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(-1, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenTwoNumbersNegative_returnFalse() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(-1, -1);
        assertEquals(false, result);

    }

    @Test
    public void givenNumberTenAndZero_returnTrue() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(10, 0);
        assertEquals(true, result);
    }

    @Test
    public void givenNumberZeroAndTen_returnTrue() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(0, 10);
        assertEquals(true, result);
    }

    @Test
    public void givenAdditionOfTwoNumbers10_returnTrue() {
        TwoMakesTen twoMakesTen = new TwoMakesTen();
        boolean result = twoMakesTen.findTwoMakesTen(9, 1);
        assertEquals(true, result);

    }
}
