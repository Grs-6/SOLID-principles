import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Item> items;

    public Order(String id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
