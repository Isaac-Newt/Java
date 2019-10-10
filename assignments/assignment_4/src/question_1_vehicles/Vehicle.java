package question_1_vehicles;

public class Vehicle {
    // Declare data members
    private String model;
    private String brand;
    private String color;
    private int year;
    private int milesPerGallon;
    
    // Define the constructor
    Vehicle(String mod, String br, String col, int yr, int mpg) {
        this.model = mod;
        this.brand = br;
        this.color = col;
        this.year = yr;
        this.milesPerGallon = mpg;
    }
    
    // Define a fuel economy method
    public String fuelEconomy() {
        return "This vehicle gets " + this.milesPerGallon + " miles per gallon";
    }
    
    // Define getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
}
