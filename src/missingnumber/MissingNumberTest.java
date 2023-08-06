package missingnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        MissingNumber missingNumber = new MissingNumber();
        int nullValue = missingNumber.findMissingNumber(null, 0);
        Assertions.assertEquals(0, nullValue);
    }

    @Test
    public void givenEmpty_returnZero() {
        MissingNumber missingNumber = new MissingNumber();
        int EmptyValue = missingNumber.findMissingNumber(new int[] {}, 0);
        Assertions.assertEquals(0, EmptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        MissingNumber missingNumber = new MissingNumber();
        int zeroValue = missingNumber.findMissingNumber(new int[] {0}, 1);
        Assertions.assertEquals(1, zeroValue);
    }

    @Test
    public void givenOne_returnOne() {
        MissingNumber missingNumber = new MissingNumber();
        int oneValue = missingNumber.findMissingNumber(new int[] {1}, 1);
        Assertions.assertEquals(1, oneValue);
    }

    @Test
    public void givenArray_returnMissingNumber() {
        MissingNumber missingNumber = new MissingNumber();
        int arrayValue = missingNumber.findMissingNumber(new int[] {1,3,4}, 3);
        Assertions.assertEquals(2, arrayValue);
    }

    @Test
    public void givenArrayNumber_returnMissingNumber() {
        MissingNumber missingNumber = new MissingNumber();
        int arrayValue = missingNumber.findMissingNumber(new int[] {1,2,3,4,6,7,8}, 7);
        Assertions.assertEquals(5, arrayValue);
    }

    @Test
    public void givenArrayOfNumbers_returnMissingNumber() {
        MissingNumber missingNumber = new MissingNumber();
        int arrayValue = missingNumber.findMissingNumber(new int[] {1,2,3,4,6,7,8}, 7);
        Assertions.assertEquals(5, arrayValue);
    }
}
