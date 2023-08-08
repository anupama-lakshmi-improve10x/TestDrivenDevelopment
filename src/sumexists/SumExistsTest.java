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
}
