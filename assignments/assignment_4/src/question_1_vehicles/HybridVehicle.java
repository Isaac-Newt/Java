package question_1_vehicles;

public class HybridVehicle extends Vehicle {
    // Declare data members
    private String model;
    private String brand;
    private String color;
    private int year;
    private int milesPerGallon;
    
    // Constructor
    HybridVehicle(String mod, String br, String col, int yr, int mpg) {
        super(mod, br, col, yr, mpg);
    }
    
    // Override fuel economy
    @Override
    public String fuelEconomy() {
        this.milesPerGallon = this.milesPerGallon + 50;
        return "This vehicle gets " + this.milesPerGallon + " miles per gallon";
    }
}
