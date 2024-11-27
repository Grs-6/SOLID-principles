import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private List<String> items = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();
    private double total;

    // Method to create an order
    public void createOrder(String item, double price) {
        items.add(item);
        prices.add(price);
        System.out.println("Item added to order: " + item + ", Price: $" + price);
    }

    // Method to calculate the total cost of the order
    public double calculateTotal() {
        total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method to generate a bill
    public void generateBill() {
        System.out.println("----- Invoice -----");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ": $" + prices.get(i));
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("-------------------");
    }
}
