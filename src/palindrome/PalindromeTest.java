package palindrome;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void nothing() {

    }

    public void givenOneNumber_returnTrue() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.findPalindrome(1);
        assertEquals(true, result);
    }
}
