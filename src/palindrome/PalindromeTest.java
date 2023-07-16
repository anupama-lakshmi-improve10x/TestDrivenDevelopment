package palindrome;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenOneNumber_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(1);
        assertEquals(true, result);
    }

    @Test
    public void givenTwoNumber_returnFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(12);
        assertEquals(false, result);
    }

    @Test
    public void givenTwoDigitPalindromeNumber_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(11);
        assertEquals(true, result);
    }
    @Test
    public void givenPalindrome_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(1111);
        assertEquals(true, result);
    }
    @Test
    public void givenPalindrome_returnFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(123);
        assertEquals(false, result);
    }

    @Test
    public void givenNegativePalindrome_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(-121);
        assertEquals(true, result);
    }

    @Test
    public void givenNegativeNumber_returnFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(-12);
        assertEquals(false, result);
    }
}
