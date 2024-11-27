public class Customer implements ICartManager {
    @Override
    public void addToCart(String product) {
        System.out.println("Customer added product to cart: " + product);
    }

    @Override
    public void placeOrder() {
        System.out.println("Customer placed an order.");
    }
}
