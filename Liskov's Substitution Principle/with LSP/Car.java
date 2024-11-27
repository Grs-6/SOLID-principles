// Car Class
public class Car extends Vehicle {
    @Override
    public double calculateRentalCost(int days) {
        return days * 50; // $50 per day for cars
    }
}