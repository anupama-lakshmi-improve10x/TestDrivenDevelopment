package consecutiveones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveOnesTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int nullValue = consecutiveOnes.findMaxConsecutiveOnes(null);
        assertEquals(0, nullValue);
    }

    @Test
    public void givenEmpty_returnZero() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int emptyValue = consecutiveOnes.findMaxConsecutiveOnes(new int[] {});
        assertEquals(0, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int zeroValue = consecutiveOnes.findMaxConsecutiveOnes(new int[] {0});
        assertEquals(1, zeroValue);
    }

    @Test
    public void givenOne_returnZero() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int oneValue = consecutiveOnes.findMaxConsecutiveOnes(new int[] {1});
        assertEquals(1, oneValue);
    }

    @Test
    public void givenArray_returnConMaxOnes() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int arrayValue = consecutiveOnes.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1});
        assertEquals(3, arrayValue);
    }

    @Test
    public void givenArrayNum_returnConMaxOnes() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int array = consecutiveOnes.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1,1});
        assertEquals(4, array);
    }

    @Test
    public void givenArrayOfFiveOnes_returnConMaxOnes() {
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int array = consecutiveOnes.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1,0,1,1,1,1,1});
        assertEquals(5, array);
    }
}
