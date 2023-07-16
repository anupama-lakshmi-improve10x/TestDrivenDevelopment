package convertminutestoseconds;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ConvertMinToSecTest {

    @Test
    public void nothing() {

    }

    @Test
    public void given1MinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int convertedMin = convertMinuteToSecond.findConMinToSec(1);
        assertEquals(60, convertedMin);
    }

    @Test
    public void given0MinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(0);
        assertEquals(0, result);
    }

    @Test
    public void givenNegativeMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(-1);
        assertEquals(-1, result);
    }
    @Test
    public void given8MinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(8);
        assertEquals(480, result);
    }
}