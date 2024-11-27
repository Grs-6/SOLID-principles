public class TotalCalculator {
    public double calculateTotal(Order order, double discount) {
        double total = order.getItems().stream()
                .mapToDouble(Item::getPrice)
                .sum();
        return total * (1 - discount); // Apply discount
    }
}
