package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnEmpty() {
        SortingArray sortingArray = new SortingArray();
        int[] nullValue = sortingArray.sorting(null);
        assertArrayEquals(new int[] {}, nullValue);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        SortingArray sortingArray = new SortingArray();
        int[] emptyValue = sortingArray.sorting(new int[] {});
        assertArrayEquals(new int[] {}, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        SortingArray sortingArray = new SortingArray();
        int[] emptyValue = sortingArray.sorting(new int[] {0});
        assertArrayEquals(new int[] {0}, emptyValue);
    }

    @Test
    public void giveArray_returnSameArray() {
        SortingArray sortingArray = new SortingArray();
        int[] emptyValue = sortingArray.sorting(new int[] {0, 1});
        assertArrayEquals(new int[] {0, 1}, emptyValue);
    }

    @Test
    public void givenArray_returnSortedArray() {
        SortingArray sortingArray = new SortingArray();
        int[] sortValue = sortingArray.sorting(new int[] {0, 1, 0, 1});
        assertArrayEquals(new int[] {0, 0, 1, 1}, sortValue);
    }

    @Test
    public void givenArray_returnArray() {
        SortingArray sortingArray = new SortingArray();
        int[] sortValue = sortingArray.sorting(new int[] {0, 1, 0, 1, 2, 0, 2});
        assertArrayEquals(new int[] {0, 0, 0, 1, 1, 2, 2}, sortValue);
    }
}
