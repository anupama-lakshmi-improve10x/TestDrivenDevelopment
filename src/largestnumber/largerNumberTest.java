package largestnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class largerNumberTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveNull_returnZero() {
        LargestNumber largestNumber = new LargestNumber();
        int largerNumber = largestNumber.findLagerNumber(null);
        assertEquals(0, largerNumber);
    }

    @Test
    public void givenEmpty_returnZero() {
        LargestNumber largestNumber = new LargestNumber();
        int emptyArray = largestNumber.findLagerNumber(new int[] {});
        assertEquals(0, emptyArray);
    }

    @Test
    public void givenZero_returnZero() {
        LargestNumber largestNumber = new LargestNumber();
        int zero = largestNumber.findLagerNumber(new int[] {0});
        assertEquals(0, zero);
    }

    @Test
    public void givenOne_returnOne() {
        LargestNumber largestNumber = new LargestNumber();
        int one = largestNumber.findLagerNumber(new int[] {1});
        assertEquals(1, one);
    }

    @Test
    public void givenTwo_returnOne() {
        LargestNumber largestNumber = new LargestNumber();
        int one = largestNumber.findLagerNumber(new int[] {2});
        assertEquals(2, one);
    }


    @Test
    public void givenArray_returnLargestNumber() {
        LargestNumber largestNumber = new LargestNumber();
        int array = largestNumber.findLagerNumber(new int[] {1,2});
        assertEquals(2, array);

    }

    @Test
    public void givenArrayWithMoreValues_returnLargestNumber() {
        LargestNumber largestNumber = new LargestNumber();
        int array = largestNumber.findLagerNumber(new int[] {46, 84, 2});
        assertEquals(84, array);
    }

}
