package convertAgeToDays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class ConvertAgeToDaysTest {
   private ConvertAgeInYears convertAgeInYears;

   @BeforeEach

    public void setup() {
       convertAgeInYears = new ConvertAgeInYears();
   }



 @Test
    public void nothing() {

 }
 /*
  calcAge(65) ➞ 23725
  calcAge(0) ➞ 0
  calcAge(20) ➞ 7300
*/

    @Test
    public void givenAgeInYearsInNegative_returnAgeInDaysNegative() {
        int age = convertAgeInYears.calcAge(-3);
        assertEquals(-1, age);
    }

    @Test
    public void givenAgeInYearsIsZero_returnAgeInDaysZero() {
        int age = convertAgeInYears.calcAge(0);
        assertEquals(0, age);
    }

    @Test
    public void givenAgeInYearsIsOne_returnAgeInDays() {
        int age = convertAgeInYears.calcAge(1);
        assertEquals(365, age);

    }

    @Test
    public void givenAgeInYearsISTen_returnAgeInDays() {
        int age = convertAgeInYears.calcAge(10);
        assertEquals(3650, age);
    }

    @Test
    public void givenAgeInYears_returnAgeInDays() {
     int age = convertAgeInYears.calcAge(65);
     assertEquals(23725, age);
 }

}
