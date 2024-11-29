public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create UserFactory instance to create users
        UserFactory userFactory = new UserFactory();

        // Create Admin and Customer using the factory
        User admin = userFactory.createUser("Admin"); // 1 for Admin
        if (admin instanceof Admin) {
            Admin adminUser = (Admin) admin;
            adminUser.login("adminUsername", "admin123");  // Correct password for login
            adminUser.addProduct("Laptop");
            adminUser.removeProduct("Tablet");
            adminUser.logout();
        }

        User customer = userFactory.createUser("Customer"); // 2 for Customer
        if (customer instanceof Customer) {
            Customer customerUser = (Customer) customer;
            customerUser.login("customerUsername", "wrongPassword");  // Wrong password
            customerUser.addToCart("Laptop");
            customerUser.placeOrder();
            customerUser.logout();
        }
    }
}
