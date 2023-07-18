package discount;

public class Discount {
    public static void main(String[] args) {
        System.out.println(findDiscount(89, 20));
    }

    public static double findDiscount(int price, int discountPercentage) {
        double result = -1;
        double discount = price * discountPercentage/100;
        if(discount >= 0) {
            double finalPrice = price - discount;
            return finalPrice;
        }
        else {
            return result;
        }
    }
}
