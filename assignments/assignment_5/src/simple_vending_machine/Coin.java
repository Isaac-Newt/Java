package simple_vending_machine;

public class Coin {
	// Define data member
	private double value;
	
	// Constructor
	public Coin(double value) {
		this.value = value;
	}
	
	// Return the coin's value
	public double getValue() {
		return this.value;
	}
}
