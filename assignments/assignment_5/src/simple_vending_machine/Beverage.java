package simple_vending_machine;

public class Beverage {
	// Declare data members
	private String Variety;
	private double Cost;
	private int Stock;
	
	// Constructor
	public Beverage(String variety, double cost, int stock) {
		this.Variety = variety;
		this.Cost = cost;
		this.Stock = stock;
	}
	
	// Display information
	@Override
	public String toString() {
		return this.Variety + ": $" + this.Cost;
	}
	
	// getter
	public double getCost() {
		return this.Cost;
	}
	
	// Dispense
	public boolean Dispense() {
		if (this.Stock > 0) {
			this.Stock = this.Stock - 1;
			System.out.println("Dispensing one " + this.Variety);
			return true;
		}
		else {
			System.out.println(this.Variety + " is out of stock");
			return false;
		}
	}
}
