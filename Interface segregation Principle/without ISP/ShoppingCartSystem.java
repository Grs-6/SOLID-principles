public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Admin actions
        IUser admin = new Admin();
        admin.addProduct("Laptop");
        admin.removeProduct("Tablet");

        // Customer actions
        IUser customer = new Customer();
        customer.addToCart("Laptop");
        customer.placeOrder();
    }
}
