package subarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraySumTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinus1() {
        SubArray subArray = new SubArray();
        int nullValue = subArray.findSumOfSubArray(null, 0);
        assertEquals(-1, nullValue);
    }

    @Test
    public void givenEmpty_returnMinus1() {
        SubArray subArray = new SubArray();
        int emptyValue = subArray.findSumOfSubArray(new int[] {}, 0);
        assertEquals(-1, emptyValue);
    }

    @Test
    public void givenOne_returnOne() {
        SubArray subArray = new SubArray();
        int oneValue = subArray.findSumOfSubArray(new int[] {1}, 1);
        assertEquals(1, oneValue);
    }

    @Test
    public void givenZeroOneTwoThree_returnTwo() {
        SubArray subArray = new SubArray();
        int arrayValue = subArray.findSumOfSubArray(new int[] {0,1,2}, 3);
        assertEquals(2, arrayValue);
    }

    @Test
    public void given3124_returnTwo() {
        SubArray subArray = new SubArray();
        int result = subArray.findSumOfSubArray(new int[] {3,1,2,4}, 6);
        assertEquals(2, result);
    }

    @Test
    public void given123_returnThree() {
        SubArray subArray = new SubArray();
        int result = subArray.findSumOfSubArray(new int[] {1,2,3}, 3);
        assertEquals(2, result);
    }
}
