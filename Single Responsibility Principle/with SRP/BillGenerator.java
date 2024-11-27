// BillGenerator Class
public class BillGenerator {

    private final OrderCalculator calculator;

    public BillGenerator(OrderCalculator calculator) {
        this.calculator = calculator;
    }

    public void generateBill(Order order) {
        System.out.println("===== Invoice =====");
        System.out.println("Order ID: " + order.getId());

        double total = calculator.calculateTotal(order);
        double tax = calculator.calculateTax(order);
        double grandTotal = calculator.calculateGrandTotal(order);

        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }

        System.out.println("-------------------");
        System.out.println("Subtotal: $" + total);
        System.out.println("Tax: $" + tax);
        System.out.println("Grand Total: $" + grandTotal);
        System.out.println("===================");
    }
}
