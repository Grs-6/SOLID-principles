// Base Vehicle Class
public class Vehicle {
    public double calculateRentalCost(int days) {
        return days * 50; // Default cost per day
    }

    public double calculateLoadFee(double loadWeight) {
        throw new UnsupportedOperationException("Load fee is not applicable for this vehicle.");
    }
}
