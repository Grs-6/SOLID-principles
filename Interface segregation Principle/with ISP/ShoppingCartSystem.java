public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Admin actions
        ICatalogManager admin = new Admin();
        admin.addProduct("Laptop");
        admin.removeProduct("Tablet");

        // Customer actions
        ICartManager customer = new Customer();
        customer.addToCart("Laptop");
        customer.placeOrder();
    }
}
