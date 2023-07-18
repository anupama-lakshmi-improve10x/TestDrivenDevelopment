package convertminutestoseconds;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ConvertMinToSecTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(-1);
        assertEquals(-1, result);
    }

    @Test
    public void givenZeroMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(0);
        assertEquals(0, result);
    }

    @Test
    public void givenOneMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int convertedMin = convertMinuteToSecond.findConMinToSec(1);
        assertEquals(60, convertedMin);
    }

    @Test
    public void givenEightMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(8);
        assertEquals(480, result);
    }

    @Test
    public void givenTwentyMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(20);
        assertEquals(1200, result);
    }

    @Test
    public void givenHundredMinToSec() {
        ConvertMinuteToSecond convertMinuteToSecond = new ConvertMinuteToSecond();
        int result = convertMinuteToSecond.findConMinToSec(100);
        assertEquals(6000, result);
    }
}