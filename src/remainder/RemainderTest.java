package remainder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class RemainderTest {

    @Test
    public void nothing() {

    }

    /* remainder(0, 1) -> 0
    remainder(1, 3) ➞ 1

     remainder(3, 4) ➞ 3

     remainder(-9, 45) ➞ -9

     remainder(5, 5) ➞ 0*/


   @Test
    public void remainderZeroAndOne_returns0() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(0,1);
        assertEquals(0, result);
    }

    // if any number divided by zero it will give arthimethic expression

   /* @Test
    public void remainderOneAndZero_returns1() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(1,0);
        assertEquals(1,result);
    }*/

    @Test
    public void remainderForOneAndThree_returns1() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(1, 3);
        assertEquals(1, result);
    }

    @Test
    public void remainderForThreeAndFour_returns3() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(3, 4);
        assertEquals(3, result);
    }

    @Test
    public void remainderForNegativeAndPostive_returnsNumber() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(-9, 45);
        assertEquals(-9, result);
    }

    @Test
    public void remainderForFiveAndFive_returnsZero() {
        Reminder reminder = new Reminder();
        int result = reminder.findRemainder(5, 5);
        assertEquals(0, result);
    }
}
