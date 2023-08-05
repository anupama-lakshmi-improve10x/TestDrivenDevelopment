package removeduplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnZero() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int nullValue = removeDuplicate.removeDuplicate(null);
        assertEquals(0, nullValue);
    }

    @Test
    public void givenEmpty_returnZero() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int emptyValue = removeDuplicate.removeDuplicate(new int[] {});
        assertEquals(0, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int zeroValue = removeDuplicate.removeDuplicate(new int[] {0});
        assertEquals(1, zeroValue);
    }

    @Test
    public void givenOne_returnZero() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int oneValue = removeDuplicate.removeDuplicate(new int[] {1});
        assertEquals(1, oneValue);
    }

    @Test
    public void givenArray_returnLength() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int twoValue = removeDuplicate.removeDuplicate(new int[] {1,1,2,2});
        assertEquals(2, twoValue);
    }

    @Test
    public void givenDuplicateArray_returnArrayLength() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int array = removeDuplicate.removeDuplicate(new int[] {1,1,2,2,3,3});
        assertEquals(3, array);
    }

    @Test
    public void givenNegativeArray_returnArrayLength() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int negativeArray = removeDuplicate.removeDuplicate(new int[] {-1,-1,-2,-2,-3,-3,-4,-4});
        assertEquals(4, negativeArray);
    }

    @Test
    public void givenArrayDuplicate_returnLength() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int array = removeDuplicate.removeDuplicate(new int[] {14,14,15,15,18,18,20,20,44,44});
        assertEquals(5, array);

    }
}
