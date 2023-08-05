package array.secondlargenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class SecondLargestNumberTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnZero() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int secondLNumber = secondLargestNumber.findSecondLargestNumber(null);
        assertEquals(0, secondLNumber);
    }

    @Test
    public void givenEmpty_returnZero() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int emptyValue = secondLargestNumber.findSecondLargestNumber(new int[] {});
        assertEquals(0, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int zeroValue = secondLargestNumber.findSecondLargestNumber(new int[] {0});
        assertEquals(Integer.MIN_VALUE, zeroValue);
    }

    @Test
    public void givenOne_returnOne() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int oneValue = secondLargestNumber.findSecondLargestNumber(new int[] {1});
        assertEquals(Integer.MIN_VALUE, oneValue);
    }

    @Test
    public void givenNine_returnNine() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int nineValue = secondLargestNumber.findSecondLargestNumber(new int[]{2});
        assertEquals(Integer.MIN_VALUE, nineValue);
    }

    @Test
    public void givenArray_returnSecondLargestNumber() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int value = secondLargestNumber.findSecondLargestNumber(new int[] {1,2});
        assertEquals(2, value);
    }

    @Test
    public void givenArrayNumber_returnSecondLargestNumber() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int value = secondLargestNumber.findSecondLargestNumber(new int[] {1,2, 5 ,8});
        assertEquals(8, value);
    }

}
