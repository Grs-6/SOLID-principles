// Flat Discount
public class FlatDiscount implements IDiscount {
    private final double flatAmount;

    public FlatDiscount(double flatAmount) {
        this.flatAmount = flatAmount;
    }

    @Override
    public double calculateDiscountedPrice(double price) {
        return price - flatAmount;
    }
}