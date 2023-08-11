package leaders;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeadersTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnEmpty() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(null, 0);
        assertEquals(new ArrayList<>(), list);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(new int[] {}, 0);
        assertEquals(new ArrayList<>(), list);
    }

    @Test
    public void givenOne_returnOne() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(new int[] {1}, 1);
        ArrayList<Integer> exepected = new ArrayList<>();
        exepected.add(0);
        assertEquals(exepected, list);
    }

    @Test
    public void given0123_returnThree() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(new int[] {0,1,2,3}, 4);
        ArrayList<Integer> exepected = new ArrayList<>();
        exepected.add(3);
        assertEquals(exepected, list);
    }

    @Test
    public void given4710_return710() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(new int[] {4,7,1,0}, 4);
        ArrayList<Integer> exepected = new ArrayList<>();
        exepected.add(7);
        exepected.add(1);
        exepected.add(0);
        assertEquals(exepected, list);
    }

    @Test
    public void givenArray_returnLeader() {
        Leaders leaders = new Leaders();
        ArrayList<Integer> list = leaders.findLeaders(new int[] {10,22,12, 3, 0, 6}, 4);
        ArrayList<Integer> exepected = new ArrayList<>();
        exepected.add(22);
        exepected.add(12);
        exepected.add(6);
        assertEquals(exepected, list);
    }
}
