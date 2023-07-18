package palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setup() {
       palindrome = new Palindrome();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeNumber_returnFalse() {
        boolean result = palindrome.findPalindrome(-12);
        assertEquals(false, result);
    }

    @Test
    public void givenZero_returnFalse() {
        boolean result = palindrome.findPalindrome(0);
        assertEquals(true, result);
    }


    @Test
    public void givenOneDigitNumber_returnTrue() {
        boolean result = palindrome.findPalindrome(1);
        assertEquals(true, result);
    }

    @Test
    public void givenTwoDigitNumberEleven_returnTrue() {
        boolean result = palindrome.findPalindrome(11);
        assertEquals(true, result);
    }

    @Test
    public void givenTwoDigitNumber_returnFalse() {
        boolean result = palindrome.findPalindrome(12);
        assertEquals(false, result);
    }

    @Test
    public void givenNegativePalindrome_returnTrue() {
        boolean result = palindrome.findPalindrome(-121);
        assertEquals(true, result);
    }

    @Test
    public void givenPositivePalindrome_returnTrue() {
        boolean result = palindrome.findPalindrome(121);
        assertEquals(true, result);
    }

    @Test
    public void givenPalindrome_returnTrue() {
        boolean result = palindrome.findPalindrome(1111);
        assertEquals(true, result);
    }
    @Test
    public void givenLongNumber_returnFalse() {
        boolean result = palindrome.findPalindrome(12345);
        assertEquals(false, result);
    }
}
