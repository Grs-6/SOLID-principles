public class RentalSystem {

    public static void main(String[] args) {
        // Creating vehicle instances
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        // Calculate rental cost for both vehicles
        System.out.println("Car Rental Cost for 5 days: $" + car.calculateRentalCost(5));
        System.out.println("Truck Rental Cost for 5 days: $" + truck.calculateRentalCost(5));

        // Attempt to calculate load fee (violates LSP)
        try {
            System.out.println("Car Load Fee for 100 units: $" + car.calculateLoadFee(100));
        } catch (UnsupportedOperationException e) {
            System.out.println("Car does not support load fee calculation.");
        }

        System.out.println("Truck Load Fee for 100 units: $" + truck.calculateLoadFee(100));
    }
}
