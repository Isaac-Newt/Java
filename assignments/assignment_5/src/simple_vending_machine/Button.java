package simple_vending_machine;

public class Button {
	// Declare data members
	private Beverage associatedBeverage;
	
	// Constructor
	public Button(Beverage bev) {
		this.associatedBeverage = bev;
	}
	
	// What to do when pushed
	public void push(double inserted) {
		double need = this.associatedBeverage.getCost();
		
		// Print beverage information
		this.associatedBeverage.toString();
		
		if (inserted >= need) {
			boolean available = dispenseBeverage();
			
			if (available) {
				illuminate();
			}
		}
		
		else {
			System.out.println("Returning Money");
		}
	}
	
	// Access the Beverage method
	public boolean dispenseBeverage() {
		return this.associatedBeverage.Dispense();
	}
	
	public void illuminate() {
		System.out.println("Button is illuminated for 5 seconds");
	}
}
