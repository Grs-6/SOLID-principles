public class Customer extends User implements ICartManager {
    private boolean isLoggedIn = false;  // To track login status
    private static final String DEFAULT_PASSWORD = "customer123"; // Default password for Customer

    @Override
    public void login(String username, String password) {
        if (password.equals(DEFAULT_PASSWORD)) {
            isLoggedIn = true;
            System.out.println("Customer logged in successfully.");
        } else {
            System.out.println("Incorrect password for Customer.");
        }
    }

    @Override
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Customer logged out.");
        } else {
            System.out.println("Customer is not logged in.");
        }
    }

    @Override
    public void addToCart(String product) {
        if (isLoggedIn) {
            System.out.println("Customer added product to cart: " + product);
        } else {
            System.out.println("Customer must be logged in to add products to cart.");
        }
    }

    @Override
    public void placeOrder() {
        if (isLoggedIn) {
            System.out.println("Customer placed an order.");
        } else {
            System.out.println("Customer must be logged in to place an order.");
        }
    }
}
