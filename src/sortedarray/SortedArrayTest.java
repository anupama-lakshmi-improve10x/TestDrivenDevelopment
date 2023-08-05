package sortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnFalse() {
        SortArray sortArray = new SortArray();
        boolean value = sortArray.isSorted(null);
        assertEquals(false, value);
    }

    @Test
    public void givenEmpty_returnFalse() {
        SortArray sortArray = new SortArray();
        boolean emptyValue = sortArray.isSorted(new int[] {});
        assertEquals(false, emptyValue);
    }

    @Test
    public void givenZero_returnFalse() {
        SortArray sortArray = new SortArray();
        boolean zeroValue = sortArray.isSorted(new int[] {0});
        assertEquals(true, zeroValue);
    }

    @Test
    public void givenOne_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean oneValue = sortArray.isSorted(new int[] {1});
        assertEquals(true, oneValue);
    }

    @Test
    public void givenOneTwo_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean oneTwoValue = sortArray.isSorted(new int[] {1,2});
        assertEquals(true, oneTwoValue);
    }

    @Test
    public void givenArray_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean sortedArray = sortArray.isSorted(new int[] {1,2,7,3});
        assertEquals(false, sortedArray);
    }

    @Test
    public void givenArrayNum_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean sortedArray = sortArray.isSorted(new int[] {1,2,3,4,5});
        assertEquals(true, sortedArray);
    }

    @Test
    public void givenArrayNumber_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean sortedArray = sortArray.isSorted(new int[] {5,6,7,8,9});
        assertEquals(true, sortedArray);
    }

    @Test
    public void givenArrayNumberIncrease_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean sortedArray = sortArray.isSorted(new int[] {3,4,24,6,7,8,9,10});
        assertEquals(false, sortedArray);
    }
}
