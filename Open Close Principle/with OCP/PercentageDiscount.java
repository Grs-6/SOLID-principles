// Percentage-Based Discount
public class PercentageDiscount implements IDiscount {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscountedPrice(double price) {
        return price - (price * (percentage / 100));
    }
}