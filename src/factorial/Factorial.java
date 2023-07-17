package factorial;

public class Factorial {
    public static void main(String[] args) {
        findFactorial(5);

    }

    public static int findFactorial(int num) {
        int fact = 1;
        if(num < 0) {
            return -1;
        } else if(num > 1) {
            for(int i = 1; i<=num; i++) {
                fact *= i;// fact = fact * i
            }
        }
        return fact;
    }
}
