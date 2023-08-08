package sumexists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumExistsTest {

    private SumExists sumExists;

    @BeforeEach
    public void setup() {
        sumExists = new SumExists();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnNo() {
        String nullValue = sumExists.sumOfTwoArrays(null, 0);
        assertEquals("No", nullValue);
    }

    @Test
    public void givenEmpty_returnNo() {
        String emptyValue = sumExists.sumOfTwoArrays(new int[] {}, 0);
        assertEquals("No", emptyValue);
    }

    @Test
    public void givenOneValue_returnNo() {
        String oneValue = sumExists.sumOfTwoArrays(new int[] {1}, 0);
        assertEquals("No", oneValue);
    }

    @Test
    public void givenZeroOneValue_returnNo() {
        String array = sumExists.sumOfTwoArrays(new int[] {0}, 0);
        assertEquals("No", array);
    }

    @Test
    public void givenZeroOneValue_returnYes() {
        String array = sumExists.sumOfTwoArrays(new int[] {0,1}, 1);
        assertEquals("Yes", array);
    }

    @Test
    public void given012_returnNo() {
        String array = sumExists.sumOfTwoArrays(new int[] {0, 1, 2}, 4);
        assertEquals("No", array);
    }

    @Test
    public void given265811_returnYes() {
        String array = sumExists.sumOfTwoArrays(new int[] {2,6,5,8,11}, 14);
        assertEquals("Yes", array);
    }

    @Test
    public void given265811_returnNo() {
        String array = sumExists.sumOfTwoArrays(new int[] {2,6,5,8,11}, 9);
        assertEquals("No", array);
    }

    @Test
    public void given0234_returnYes() {
        String array = sumExists.sumOfTwoArrays(new int[] {0,2,3,4}, 4);
        assertEquals("Yes", array);
    }

    @Test
    public void given1234_returnYes() {
        String array = sumExists.sumOfTwoArrays(new int[] {1,2,3,4}, 4);
        assertEquals("Yes", array);
    }

    @Test
    public void given234_returnNo() {
        String array = sumExists.sumOfTwoArrays(new int[] {2,3,4}, 4);
        assertEquals("No", array);
    }

    @Test
    public void givenNegativeValue_returnYes() {
        String array = sumExists.sumOfTwoArrays(new int[] {-2,-2,0}, -4);
        assertEquals("Yes", array);
    }

    @Test
    public void givenNegativeValue_returnNo() {
        String array = sumExists.sumOfTwoArrays(new int[] {-2,-1,0}, -8);
        assertEquals("No", array);
    }
}
