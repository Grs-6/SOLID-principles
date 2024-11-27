import java.util.List;

public class DiscountService {

    public double calculateFinalPrice(double price, List<IDiscount> discounts) {
        double discountedPrice = price;
        for (IDiscount discount : discounts) {
            discountedPrice = discount.calculateDiscountedPrice(discountedPrice);
        }
        return discountedPrice;
    }
}
