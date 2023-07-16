package divisible;

public class DivisibleByFive {
    public boolean divisible(int num) {
        boolean result = false;
        if(num % 5 == 0) {
            result = true;
        }
        return result;
    }
}
