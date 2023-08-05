package leftrotatearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotateArrayTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnEmpty() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] nullValue = leftRotateArray.leftRotate(null, 0);
        assertArrayEquals(new int[] {}, nullValue);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] emptyValue = leftRotateArray.leftRotate(new int[] {}, 0);
        assertArrayEquals(new int[] {}, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] zeroValue = leftRotateArray.leftRotate(new int[] {0}, 1);
        assertArrayEquals(new int[] {0}, zeroValue);
    }

    @Test
    public void givenArray_return() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] arrayValue = leftRotateArray.leftRotate(new int[] {1,2}, 2);
        assertArrayEquals(new int[] {2,1}, arrayValue);
    }

    @Test
    public void givenArray_returnArray() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] arrayValue = leftRotateArray.leftRotate(new int[] {1,2,3,4,5}, 5);
        assertArrayEquals(new int[] {2,3,4,5,1}, arrayValue);
    }

    @Test
    public void givenNegativeArray_returnArray() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] negativeArray = leftRotateArray.leftRotate(new int[] {-1,-2,-3,-4,-5}, 5);
        assertArrayEquals(new int[] {-2,-3,-4,-5,-1}, negativeArray);
    }
}
