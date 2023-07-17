package discount;

public class Discount {
    public static void main(String[] args) {
        System.out.println(findDiscount(89, 20));
    }

    public static double findDiscount(int price, int discountPercentage) {
        double discount = price * discountPercentage/100;
        double finalPrice = price - discount;
        return finalPrice;
    }
}
