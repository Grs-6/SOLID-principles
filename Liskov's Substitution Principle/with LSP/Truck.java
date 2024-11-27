// Truck Class
public class Truck extends Vehicle implements ILoadable {
    @Override
    public double calculateRentalCost(int days) {
        return days * 100; // $100 per day for trucks
    }

    @Override
    public double calculateLoadFee(double loadWeight) {
        return loadWeight * 10; // $10 per unit load weight
    }
}