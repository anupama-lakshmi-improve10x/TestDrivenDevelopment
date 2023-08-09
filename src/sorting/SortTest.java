package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnEmpty() {
        SortingArray sortingArray = new SortingArray();
        int[] nullValue = sortingArray.sorting(null);
        Assertions.assertArrayEquals(new int[] {}, nullValue);
    }
}
