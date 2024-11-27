public class Admin implements IUser {
    @Override
    public void addProduct(String product) {
        System.out.println("Admin added product to catalog: " + product);
    }

    @Override
    public void removeProduct(String product) {
        System.out.println("Admin removed product from catalog: " + product);
    }

    @Override
    public void addToCart(String product) {
        throw new UnsupportedOperationException("Admins do not have a shopping cart.");
    }

    @Override
    public void placeOrder() {
        throw new UnsupportedOperationException("Admins cannot place orders.");
    }
}
