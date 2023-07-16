package converthoursandminutesintoseconds;

import convertminutestoseconds.ConvertMinuteToSecond;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ConvertHoursAndMinutesIntoSecondsTest {

    @Test
    public void nothing() {

    }

    @Test
    public void given1hour20Minutes_return4800Seconds() {
        ConvertHoursAndMinutes convertHoursAndMinutes = new ConvertHoursAndMinutes();
        int convert = convertHoursAndMinutes.convert(1, 20);
        assertEquals(4800, convert);
    }

    @Test
    public void given0Hour0Minutes_return0Seconds() {
        ConvertHoursAndMinutes convertHoursAndMinutes = new ConvertHoursAndMinutes();
        int convert = convertHoursAndMinutes.convert(0,0);
        assertEquals(0, convert);
    }

    @Test
    public void givenNegativeHourNegativeMinutes_returnNegativeSeconds() {
        ConvertHoursAndMinutes convertHoursAndMinutes = new ConvertHoursAndMinutes();
        int convert = convertHoursAndMinutes.convert(-1, -1);
        assertEquals(-1, convert);
    }
}
