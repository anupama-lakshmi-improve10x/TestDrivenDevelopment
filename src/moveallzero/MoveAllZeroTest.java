package moveallzero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveAllZeroTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnEmpty() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] nullValue = moveZerosToEnd.moveAllZerosToEnd(null, 0);
        assertArrayEquals(new int[] {}, nullValue);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] emptyValue = moveZerosToEnd.moveAllZerosToEnd(new int[] {}, 0);
        assertArrayEquals(new int[] {}, emptyValue);
    }

    @Test
    public void givenOneNum_returnSameNum() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] oneValue = moveZerosToEnd.moveAllZerosToEnd(new int[] {0}, 1);
        assertArrayEquals(new int[] {0}, oneValue);
    }

    @Test
    public void given001_return100() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] value = moveZerosToEnd.moveAllZerosToEnd(new int[] {0,0,1}, 3);
        assertArrayEquals(new int[] {1,0, 0}, value);
    }

    @Test
    public void given010_return100() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] value = moveZerosToEnd.moveAllZerosToEnd(new int[] {0,1,0}, 3);
        assertArrayEquals(new int[] {1,0, 0}, value);
    }

    @Test
    public void given01020_return1200() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] value = moveZerosToEnd.moveAllZerosToEnd(new int[] {0,1,0,2,0}, 5);
        assertArrayEquals(new int[] {1,2, 0, 0, 0}, value);
    }

    @Test
    public void given01020340_return1200() {
        MoveZerosEnd moveZerosToEnd = new MoveZerosEnd();
        int[] value = moveZerosToEnd.moveAllZerosToEnd(new int[] {0,1,0,2,0,3,4,0}, 8);
        assertArrayEquals(new int[] {1,2, 3, 4, 0, 0, 0, 0}, value);
    }



}
