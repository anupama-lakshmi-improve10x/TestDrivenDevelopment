package bomb;

public class Bomb {

    public String findTheBomb(String text) {
        String textInLowerCase = text.toLowerCase();
        if(textInLowerCase.contains("bomb")) {
            return "Duck";
        } else{
            return "Relax, there's no bomb.";
        }
    }
}
