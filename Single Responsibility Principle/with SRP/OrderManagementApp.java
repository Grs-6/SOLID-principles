public class OrderManagementApp {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("ORD123");
        order.addItem(new Item("Laptop", 1000.0));
        order.addItem(new Item("Mouse", 50.0));
        order.addItem(new Item("Keyboard", 100.0));

        // Initialize modules
        OrderCalculator calculator = new OrderCalculator();
        BillGenerator billGenerator = new BillGenerator(calculator);

        // Generate bill
        billGenerator.generateBill(order);
    }
}
