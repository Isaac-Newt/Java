package average;

public class Average {
	// Declare data members
	private int value1, value2, value3;
	private double average;
	
	// Constructor
	Average(int value1, int value2, int value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	// Print the average
	public double calculateAverage() {		
		this.average = (this.value1 + this.value2 + this.value3) / 3;
		System.out.println("The average is: " + this.average);
		return this.average;
	}
	
}
