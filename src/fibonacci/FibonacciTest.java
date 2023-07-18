package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public  void setup() {
        fibonacci = new Fibonacci();
    }

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
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnZero() {
        int zerothFibonacci = fibonacci.find(0);
        assertEquals(0, zerothFibonacci);
    }

    @Test
    public void givenOne_returnOne() {
        int firstFibonacci = fibonacci.find(1);
        assertEquals(1, firstFibonacci);
    }

    @Test
    public void givenFour_returnThree() {
        int fourthFibonacci = fibonacci.find(4);
        assertEquals(3, fourthFibonacci);
    }

}
