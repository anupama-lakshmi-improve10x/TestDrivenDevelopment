package farmproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FarmTest {

    private  Farm farm;

    @BeforeEach

    public void setup() {
        farm = new Farm();
    }

    @Test
    public void nothing() {

    }

    /* FindTotalLegs(2, 3, 5) ➞ 36
       FindTotalLegs(1, 2, 3) ➞ 22
       FindTotalLegs(5, 2, 8) ➞ 50
*/

    @Test
    public void givenNoOfLegsAsNegativeValues_returnNoOfLegs() {
        int result = farm.findTotalLegs(-1, -3, -5);
        assertEquals(-1, result);
    }

    @Test
    public void givenNoOfLegsAsNegative_returnNoOfLegs() {
        int result = farm.findTotalLegs(0, -3, -5);
        assertEquals(-1, result);
    }

    @Test
    public void givenNoOfLegsAsNegativeChickensAndPigs_returnNoOfLegs() {
        int result = farm.findTotalLegs(-2, 0, -1);
        assertEquals(-1, result);
    }

    @Test
    public void givenNoOfLegsAsNegativeChickensAndCows_returnNoOfLegs() {
        int result = farm.findTotalLegs(-4, -2, 0);
        assertEquals(-1, result);
    }


    @Test
    public void givenNoOfLegsAsZero_returnNoOfLegs() {
        int result = farm.findTotalLegs(0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenNoOfLegsOfAnimals_returnNoOfLegs() {
        int result = farm.findTotalLegs(0, 5, 8);
        assertEquals(52, result);
    }

    @Test
    public void givenNoOfLegsOfAnimals_returnTotalLegs() {
        int result = farm.findTotalLegs(2,0,0);
        assertEquals(4, result);
    }

    @Test
    public void givenNoOfAnimalsLegs_returnTotalLegs() {
        int result = farm.findTotalLegs(0,0,5);
        assertEquals(20, result);
    }

    @Test
    public void givenNoOfLegs_returnTotalLegs() {
        int result = farm.findTotalLegs(2,3,5);
        assertEquals(36, result);
    }

    @Test
    public void givenNoOfLegsAsPositiveAndNegative_returnNoOfLegs() {
        int result = farm.findTotalLegs(-1, 3, -5);
        assertEquals(-1, result);
    }
}
