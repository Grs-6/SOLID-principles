import java.util.ArrayList;
import java.util.List;

public class RentalSystem {

    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Truck());

        // Calculate rental costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("Rental Cost for 5 days: $" + vehicle.calculateRentalCost(5));

            // Handle load fee if the vehicle is ILoadable
            if (vehicle instanceof ILoadable) {
                ILoadable loadable = (ILoadable) vehicle;
                System.out.println("Load Fee for 100 units: $" + loadable.calculateLoadFee(100));
            }
        }
    }
}
