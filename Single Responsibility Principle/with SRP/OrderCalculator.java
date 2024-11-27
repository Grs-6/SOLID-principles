// OrderCalculator Class
public class OrderCalculator {

    private static final double TAX_RATE = 0.1; // Example: 10% tax

    public double calculateTotal(Order order) {
        double total = 0.0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTax(Order order) {
        return calculateTotal(order) * TAX_RATE;
    }

    public double calculateGrandTotal(Order order) {
        return calculateTotal(order) + calculateTax(order);
    }
}
