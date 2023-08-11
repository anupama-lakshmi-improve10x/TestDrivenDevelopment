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
}
