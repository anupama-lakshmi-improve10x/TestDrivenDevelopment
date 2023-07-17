package divisible;

public class DivisibleByFive {
    public boolean isDivisible(int num) {
        boolean result = false;
        if(num % 5 == 0) {
            result = true;
        }
        return result;
    }
}
