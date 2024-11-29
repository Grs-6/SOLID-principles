public class UserFactory {
    public User createUser(String type) {
        User user = null;

        // Switch to create the right type of user based on 'type'
        switch (type) {
            case "Admin":
                user = new Admin();
                break;
            case "Customer":
                user = new Customer();
                break;
            default:
                System.out.println("No object is created");
                break;
        }

        return user;
    }
}
