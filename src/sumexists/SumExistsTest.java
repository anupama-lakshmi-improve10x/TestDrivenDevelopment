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
}
