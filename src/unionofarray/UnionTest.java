package unionofarray;

import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnZero() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(null, null);
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void givenEmpty_returnEmptyList() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{}, new Integer[]{});
        assertEquals(new ArrayList<>(), unionArray);
    }

    @Test
    public void given0And0_return0() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{0}, new Integer[]{0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given000And000_return0() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{0,0,0}, new Integer[]{0,0,0});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected, unionArray);

    }

    @Test
    public void given012And0234_return0() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{0,1,2}, new Integer[]{0,2,3,4});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, unionArray);
    }

    @Test
    public void given012345And02345678_return0() {
        Union union = new Union();
        ArrayList<Integer> unionArray = union.findUnion(new Integer[]{0,1,2,3,4,5}, new Integer[]{0,2,3,4,5,6,7,8});
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        assertEquals(expected, unionArray);
    }
}
