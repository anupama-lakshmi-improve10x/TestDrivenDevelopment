package discount;

public class Discount {
    public static void main(String[] args) {
        System.out.println(findDiscount(89, 20));
    }

    public static float findDiscount(int price, int discountPercentage) {
        float discount = price * discountPercentage/100;
        float finalPrice = price - discount;
        return finalPrice;
    }
}
