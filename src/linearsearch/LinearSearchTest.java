package linearsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinusOne() {
        LinearSearch linearSearch = new LinearSearch();
        int nullValue = linearSearch.findLinearSearch(null, 0);
        assertEquals(-1, nullValue);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        LinearSearch linearSearch = new LinearSearch();
        int emptyValue = linearSearch.findLinearSearch(new int[] {}, 0);
        assertEquals(-1, emptyValue);
    }

    @Test
    public void givenOne_returnOne() {
        LinearSearch linearSearch = new LinearSearch();
        int oneValue = linearSearch.findLinearSearch(new int[] {1, 2}, 1);
        assertEquals(0, oneValue);
    }

    @Test
    public void givenArray_returnPosition() {
        LinearSearch linearSearch = new LinearSearch();
        int emptyValue = linearSearch.findLinearSearch(new int[] {9, 7, 2, 16, 4}, 16);
        assertEquals(3, emptyValue);
    }

    @Test
    public void givenArrayValue_returnPosition() {
        LinearSearch linearSearch = new LinearSearch();
        int emptyValue = linearSearch.findLinearSearch(new int[] {6, 4, 2, 16, 8, 3}, 3);
        assertEquals(5, emptyValue);
    }
}
