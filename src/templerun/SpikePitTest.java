package templerun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void givenMinusOne_throwsInvalidSpikePitWidthException() {
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(-1),
                "SpikePit Width should be between 0 to 20");
    }

    @Test
    public void given21_throwsInvalidSpikePitWidthException() {
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(21),
                "SpikePit Width should be between 0 to20");
    }

    @Test
    public void given10_whenTrapMethodCalled_displayTrapMessage() throws Exception{
        SpikePit spikePit = new SpikePit(100);
        Player player = new Player("Name");
        spikePit.trap(player);
        assertEquals("SpikePit" + "trapped" + "Name" + "inside! it is "  + 100 + " meters width!", outputStream.toString().trim());
    }

    @Test
    public void given20_whenTrapMethodCalled_displayTrapMessage() throws Exception {
        SpikePit spikePit = new SpikePit(20);
        Player player = new Player("Name");
        spikePit.trap(player);
        assertEquals(50, player.getHealth());
    }
}
