package farmproblem;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FarmTest {

    @Test
    public void nothing() {

    }

    /* FindTotalLegs(2, 3, 5) ➞ 36
       FindTotalLegs(1, 2, 3) ➞ 22
       FindTotalLegs(5, 2, 8) ➞ 50
*/

    @Test
    public void givenNoOfLegs_returnTotalLegs() {
        Farm farm = new Farm();
        int result = farm.findTotalLegs(2,3,5);
        assertEquals(36, result);
    }

    @Test
    public void givenNoOfLegsAsZero_returnNoOfLegs() {
        Farm farm = new Farm();
        int result = farm.findTotalLegs(0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenNoOfLegsAsNegative_returnNoOfLegs() {
        Farm farm = new Farm();
        int result = farm.findTotalLegs(-1, -3, -5);
        assertEquals(-34, result);
    }

    @Test
    public void givenNoOfLegsAsPositiveAndNegative_returnNoOfLegs() {
        Farm farm = new Farm();
        int result = farm.findTotalLegs(-1, 3, -5);
        assertEquals(-10, result);
    }
}
