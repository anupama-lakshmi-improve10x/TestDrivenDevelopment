package stringending;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class StringEndingTest {

    @Test
    public void nothing() {
    }

    /*checkEnding("abc", "bc") ➞ true

    checkEnding("abc", "d") ➞ false

    checkEnding("samurai", "zi") ➞ false

    checkEnding("feminine", "nine") ➞ true

    checkEnding("convention", "tio") ➞ false
*/

    @Test
    public void givenEmptyString_returnTrue() {
        StringEndingMatches stringEndingMatches = new StringEndingMatches();
        boolean result = stringEndingMatches.checkEnding("", "");
        assertEquals(true, result);
    }

    @Test
    public void givenTwoStringIfFirstStringEndsWithSecond_returnTrue() {
        StringEndingMatches stringEndingMatches = new StringEndingMatches();
        boolean result = stringEndingMatches.checkEnding("abc", "bc");
        assertEquals(true, result);
    }

    @Test
    public void givenTwoStringOneStringIsEmpty_returnTrue() {
        StringEndingMatches stringEndingMatches = new StringEndingMatches();
        boolean result = stringEndingMatches.checkEnding("abc", "");
        assertEquals(true, result);
    }

    @Test
    public void givenTwoStringIsEmptyStringOne_returnTrue() {
        StringEndingMatches stringEndingMatches = new StringEndingMatches();
        boolean result = stringEndingMatches.checkEnding("", "abc");
        assertEquals(false, result);
    }
}
