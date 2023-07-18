package converthoursandminutesintoseconds;

import convertminutestoseconds.ConvertMinuteToSecond;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ConvertHoursAndMinutesIntoSecondsTest {
    private  ConvertHoursAndMinutes convertHoursAndMinutes;

    @BeforeEach

    public void setup() {
        convertHoursAndMinutes = new ConvertHoursAndMinutes();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeHourNegativeMinutes_returnNegativeSeconds() {
        int convert = convertHoursAndMinutes.convert(-1, -1);
        assertEquals(-1, convert);
    }

    @Test
    public void givenNegativeHourZeroMinutes_returnNegativeSeconds() {
        int convert = convertHoursAndMinutes.convert(-1, 0);
        assertEquals(-1, convert);
    }

    @Test
    public void givenZeroHourNegativeMinutes_returnNegativeSeconds() {
        int convert = convertHoursAndMinutes.convert(0, -3);
        assertEquals(-1, convert);
    }

    @Test
    public void givenZeroHourZeroMinutes_return0Seconds() {
        int convert = convertHoursAndMinutes.convert(0,0);
        assertEquals(0, convert);
    }

    @Test
    public void givenOneHourZeroMinutes_return0Seconds() {
        int convert = convertHoursAndMinutes.convert(1,0);
        assertEquals(3600, convert);
    }

    @Test
    public void givenZeroHourFourMinutes_return0Seconds() {
        int convert = convertHoursAndMinutes.convert(0,4);
        assertEquals(240, convert);
    }

    @Test
    public void given1hour20Minutes_return4800Seconds() {
        int convert = convertHoursAndMinutes.convert(1, 20);
        assertEquals(4800, convert);
    }

    @Test
    public void given2hour30Minutes_return9000Seconds() {
        int convert = convertHoursAndMinutes.convert(2, 30);
        assertEquals(9000, convert);
    }

}
