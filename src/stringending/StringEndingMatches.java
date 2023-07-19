package stringending;

public class StringEndingMatches {
    public boolean checkEnding(String str1, String str2) {
        boolean result = false;
        if(str1 == null && str2 == null) {
            result = true;
        } else if (str1 == null || str2 == null) {
            result = false;
        }else if(str1 == " " && str2 == "") {
            result = false;
        }else if(str1.endsWith(str2)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
