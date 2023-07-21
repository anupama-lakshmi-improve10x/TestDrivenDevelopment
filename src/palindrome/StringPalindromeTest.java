package palindrome;

import Stringpalindrome.StringPalindrome;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class StringPalindromeTest {

    @Test

    public void nothing() {
    }

    @Test
    public void givenNull_returnNull() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome(null);
        assertEquals(false, result);

    }

    @Test
    public void givenEmpty_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("");
        assertEquals(true, result);
    }

    @Test
    public void givenOneLetter_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("a");
        assertEquals(true, result);
    }

    @Test
    public void givenTwoLetters_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("ab");
        assertEquals(false, result);
    }

    @Test
    public void givenTwoLettersAsAA_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("aa");
        assertEquals(true, result);
    }

    @Test
    public void givenTwoLettersAsABA_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("aba");
        assertEquals(true, result);
    }

    @Test
    public void givenWord_returnTrue() {
        StringPalindrome stringPalindrome = new StringPalindrome();
        boolean result = stringPalindrome.isPalindrome("madam");
        assertEquals(true, result);
    }


}
