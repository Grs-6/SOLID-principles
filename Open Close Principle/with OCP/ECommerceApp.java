import java.util.ArrayList;

public class ECommerceApp {
    public static void main(String[] args) {
        double originalPrice = 500.00;

        // Create specific discounts
        IDiscount percentageDiscount = new PercentageDiscount(10); // 10% off
        IDiscount flatDiscount = new FlatDiscount(50);             // $50 off
        IDiscount membershipDiscount = new MembershipDiscount(0.05); // 5% off for members

        // Apply multiple discounts
        ArrayList<IDiscount> discounts = new ArrayList<>();
        discounts.add(percentageDiscount);
        discounts.add(flatDiscount);
        discounts.add(membershipDiscount);

        // Calculate final price
        DiscountService discountService = new DiscountService();
        double finalPrice = discountService.calculateFinalPrice(originalPrice, discounts);

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Final Price after Discounts: $" + finalPrice);
    }
}
