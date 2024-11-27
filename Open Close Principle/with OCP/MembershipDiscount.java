// Membership Discount (Example of a New Feature)
public class MembershipDiscount implements IDiscount {
    private final double membershipRate;

    public MembershipDiscount(double membershipRate) {
        this.membershipRate = membershipRate;
    }

    @Override
    public double calculateDiscountedPrice(double price) {
        return price * (1 - membershipRate);
    }
}