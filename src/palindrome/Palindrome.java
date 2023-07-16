package palindrome;

public class Palindrome {


    public boolean findPalindrome(int n) {
        boolean result = false;
        int reverse = 0;
        int temp = n;
        while(n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n/10;
        } if(temp == reverse) {
            result = true;
        }
        return result;
    }
}
