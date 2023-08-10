package majorityelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnMinusOne() {
        Majority majority = new Majority();
        int nullValue = majority.findMajorityElement(null);
        assertEquals(-1, nullValue);
    }

    @Test
    public void givenEmpty_returnMinusOne() {
        Majority majority = new Majority();
        int emptyValue = majority.findMajorityElement(new int[] {});
        assertEquals(-1, emptyValue);
    }

    @Test
    public void givenZero_returnZero() {
        Majority majority = new Majority();
        int zeroValue = majority.findMajorityElement(new int[] {0});
        assertEquals(0, zeroValue);
    }

    @Test
    public void given001_returnOne() {
        Majority majority = new Majority();
        int result = majority.findMajorityElement(new int[] {0, 0, 1});
        assertEquals(0, result);
    }

    @Test
    public void given004111_returnOne() {
        Majority majority = new Majority();
        int result = majority.findMajorityElement(new int[] {0, 0, 4, 1, 1, 1, 1});
        assertEquals(1, result);
    }

    @Test
    public void given422_returnOne() {
        Majority majority = new Majority();
        int result = majority.findMajorityElement(new int[] {4, 2, 2});
        assertEquals(2, result);
    }

    @Test
    public void given4211_returnOne() {
        Majority majority = new Majority();
        int result = majority.findMajorityElement(new int[] {4, 2, 1, 1});
        assertEquals(-1, result);
    }
}
