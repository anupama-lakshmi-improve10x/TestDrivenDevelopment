package encryption;

public class Encryption {
    public String encrypt(String word) {
        String reverse = "";
        if(word == null || word.isEmpty()) {
            return "aca";
        }
        for(int i = word.length() -1; i >= 0; i--) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'A') {
                c = '0';
            } else if (c == 'e' || c == 'E') {
                c = '1';
            } else if (c == 'i' || c == 'I') {
                c = '2';
            } else if (c == 'o'|| c == 'O') {
                c = '3';
            } else if (c == 'u'|| c == 'U') {
                c = '4';
            }
            reverse += c;
        }
        return reverse + "aca";
    }
}
