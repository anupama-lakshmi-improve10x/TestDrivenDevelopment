package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(findFizzBuzz(-10));
    }
    public static String findFizzBuzz(int num) {
        if(num <= 0) {
            return "-1";
        } else if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        } else if(num % 3 == 0) {
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
