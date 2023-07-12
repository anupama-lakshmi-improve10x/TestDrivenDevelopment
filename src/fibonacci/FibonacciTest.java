package fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class FibonacciTest {

    @Test
    public void nothing() {

    }
    /* 0,1,1,2,3,5,8...
    if n = -10 , return -1
    if n= 0  return 0
    if n =1 return 1
    if n =2 return 1
    if n = 3 return 2
     */

    @Test
    public void givenAnyFibonacciNegative_returnNegative1() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnZero() {
        Fibonacci fibonacci = new Fibonacci();
        int zerothFibonacci = fibonacci.find(0);
        assertEquals(0, zerothFibonacci);
    }

    @Test
    public void givenOne_returnOne() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.find(1);
        assertEquals(1, firstFibonacci);
    }

    @Test
    public void givenFour_returnTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int fourthFibonacci = fibonacci.find(4);
        assertEquals(3, fourthFibonacci);
    }

}
