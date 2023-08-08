package sumexists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumExistsTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnNo() {
        SumExists sumExists = new SumExists();
        String nullValue = sumExists.sumOfTwoArrays(null, 0);
        assertEquals("No", nullValue);
    }

    @Test
    public void givenEmpty_returnNo() {
        SumExists sumExists = new SumExists();
        String emptyValue = sumExists.sumOfTwoArrays(new int[] {}, 0);
        assertEquals("No", emptyValue);
    }

    @Test
    public void givenOneValue_returnNo() {
        SumExists sumExists = new SumExists();
        String oneValue = sumExists.sumOfTwoArrays(new int[] {1}, 0);
        assertEquals("No", oneValue);
    }

    @Test
    public void givenZeroOneValue_returnNo() {
        SumExists sumExists = new SumExists();
        String array = sumExists.sumOfTwoArrays(new int[] {0}, 0);
        assertEquals("No", array);
    }

    @Test
    public void givenZeroOneValue_returnYes() {
        SumExists sumExists = new SumExists();
        String array = sumExists.sumOfTwoArrays(new int[] {0,1}, 1);
        assertEquals("Yes", array);
    }

    @Test
    public void given012_returnNo() {
        SumExists sumExists = new SumExists();
        String array = sumExists.sumOfTwoArrays(new int[] {0, 1, 2}, 4);
        assertEquals("No", array);
    }

    @Test
    public void given265811_returnYes() {
        SumExists sumExists = new SumExists();
        String array = sumExists.sumOfTwoArrays(new int[] {2,6,5,8,11}, 14);
        assertEquals("Yes", array);
    }

    @Test
    public void given265811_returnNo() {
        SumExists sumExists = new SumExists();
        String array = sumExists.sumOfTwoArrays(new int[] {2,6,5,8,11}, 9);
        assertEquals("No", array);
    }
}
