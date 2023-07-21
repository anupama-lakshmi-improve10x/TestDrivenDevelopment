package Stringpalindrome;

public class StringPalindrome {

    public boolean isPalindrome(String name) {
        if(name == null) {
            return false;
        } else if(name == "") {
            return  true;
        } else if(name.length() == 1) {
            return true;
        } else if(name.length() >= 2) {
            String reverse = "";
            for(int i= name.length()-1; i>=0; i--) {
                reverse += name.charAt(i);
                if(name.equals(reverse)) {
                    return true;
                }
            }
        }
       return false;
    }
}
