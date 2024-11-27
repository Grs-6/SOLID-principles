public class DiscountService {

    public double applyDiscount(double price, String discountType, double discountValue) {
        if (discountType.equals("Percentage")) {
            return price - (price * (discountValue / 100));
        } else if (discountType.equals("Flat")) {
            return price - discountValue;
        } else {
            throw new IllegalArgumentException("Invalid discount type");
        }
    }
}
