package discount;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;


public class DiscountTest {

    @Test
    public void nothing() {

    }

    /*
    discount(1500, 50) ➞ 750

   discount(89, 20) ➞ 71.2

   discount(100, 75) ➞ 25

     */

    @Test
    public void givenPriceAndDiscountPercentage_returnFinalPrice() {
        Discount discount = new Discount();
        double result = discount.findDiscount(100, 75);
        assertEquals(25, result);
    }

    @Test
    public void givenPriceAndDiscountPercentage_returnFinalPriceInFloat() {
        Discount discount = new Discount();
        double result = discount.findDiscount(89, 20);
        assertEquals(72.0, result);
    }

    @Test
    public void givenPriceAndDiscountPercentageZero_returnFinalPrice() {
        Discount discount = new Discount();
        double result = discount.findDiscount(89, 0);
        assertEquals(89, result);
    }

    @Test
    public void givenPriceAndDiscountZero_returnFinalPrice() {
        Discount discount = new Discount();
        double result = discount.findDiscount(0, 0);
        assertEquals(0, result);
    }
}
