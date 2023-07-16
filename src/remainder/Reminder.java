package remainder;

public class Reminder {
    public int findRemainder(int a, int b) throws ArithmeticException {
        int result = 0;
        if (b != 0) {
            result = a % b;
        }
        return result;
    }

}
