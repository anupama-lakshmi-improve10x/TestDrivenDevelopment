package stringending;

public class StringEndingMatches {
    public boolean checkEnding(String str1, String str2) {
        boolean result = false;
        if(str1.endsWith(str2)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
