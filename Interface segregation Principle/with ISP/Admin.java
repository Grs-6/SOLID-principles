public class Admin implements ICatalogManager {
    @Override
    public void addProduct(String product) {
        System.out.println("Admin added product to catalog: " + product);
    }

    @Override
    public void removeProduct(String product) {
        System.out.println("Admin removed product from catalog: " + product);
    }
}
