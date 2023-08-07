package singleelement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleElementTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnNegativeOne() {
        SingleElement singleElement = new SingleElement();
        int nullValue = singleElement.getSingleElement(null);
        Assertions.assertEquals(-1, nullValue);
    }
}
