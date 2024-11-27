public class Customer implements IUser {
    @Override
    public void addProduct(String product) {
        throw new UnsupportedOperationException("Customers cannot add products to the catalog.");
    }

    @Override
    public void removeProduct(String product) {
        throw new UnsupportedOperationException("Customers cannot remove products from the catalog.");
    }

    @Override
    public void addToCart(String product) {
        System.out.println("Customer added product to cart: " + product);
    }

    @Override
    public void placeOrder() {
        System.out.println("Customer placed an order.");
    }
}
