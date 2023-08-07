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

    @Test
    public void givenEmpty_returnNegativeOne() {
        SingleElement singleElement = new SingleElement();
        int emptyValue = singleElement.getSingleElement(new int[] {});
        Assertions.assertEquals(-1, emptyValue);
    }

    @Test
    public void givenZero_returnOne() {
        SingleElement singleElement = new SingleElement();
        int zeroValue = singleElement.getSingleElement(new int[] {0});
        Assertions.assertEquals(1, zeroValue);
    }

    @Test
    public void givenOne_returnOne() {
        SingleElement singleElement = new SingleElement();
        int oneValue = singleElement.getSingleElement(new int[] {1});
        Assertions.assertEquals(1, oneValue);
    }

    @Test
    public void givenTwoOnes_returnOne() {
        SingleElement singleElement = new SingleElement();
        int twoOnesValue = singleElement.getSingleElement(new int[] {1, 1});
        Assertions.assertEquals(-1, twoOnesValue);
    }

    @Test
    public void givenTwoOnesAndThree_returnThree() {
        SingleElement singleElement = new SingleElement();
        int twoOnesAndThreeValue = singleElement.getSingleElement(new int[] {1, 1, 3});
        Assertions.assertEquals(3, twoOnesAndThreeValue);
    }

    @Test
    public void givenArray_returnSeven() {
        SingleElement singleElement = new SingleElement();
        int twoOnesAndThreeValue = singleElement.getSingleElement(new int[] {1, 1, 3, 3, 4, 4, 4, 7});
        Assertions.assertEquals(7, twoOnesAndThreeValue);
    }
}
