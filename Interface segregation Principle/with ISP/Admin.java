public class Admin extends User implements ICatalogManager {
    private boolean isLoggedIn = false;  // To track login status
    private static final String DEFAULT_PASSWORD = "admin123"; // Default password for Admin

    @Override
    public void login(String username, String password) {
        if (password.equals(DEFAULT_PASSWORD)) {
            isLoggedIn = true;
            System.out.println("Admin logged in successfully.");
        } else {
            System.out.println("Incorrect password for Admin.");
        }
    }

    @Override
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("Admin logged out.");
        } else {
            System.out.println("Admin is not logged in.");
        }
    }

    @Override
    public void addProduct(String product) {
        if (isLoggedIn) {
            System.out.println("Admin added product to catalog: " + product);
        } else {
            System.out.println("Admin must be logged in to add products.");
        }
    }

    @Override
    public void removeProduct(String product) {
        if (isLoggedIn) {
            System.out.println("Admin removed product from catalog: " + product);
        } else {
            System.out.println("Admin must be logged in to remove products.");
        }
    }
}
