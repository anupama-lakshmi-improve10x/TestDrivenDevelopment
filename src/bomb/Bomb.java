package bomb;

public class Bomb {

    public String findTheBomb(String text) {
        String result = "";
        if (text == null) {
            return null;
        }
        if(text == "") {
            return  "";
        }
        String textInLowerCase = text.toLowerCase();
          if (textInLowerCase.contains("bomb")) {
            result = "Duck";
        } else {
            result = "Relax, there's no bomb.";
        }
        return result;
    }
}

