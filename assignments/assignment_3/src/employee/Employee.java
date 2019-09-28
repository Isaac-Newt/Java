package employee;

public class Employee {
	// Declare data members
	private String name, joinYear, address;
	
	// Constructor
	Employee(String name, String year, String address) {
		this.name = name;
		this.joinYear = year;
		this.address = address;
	}
	
	// Print the employee information
	@Override
	public String toString() {
		String info = this.name +
			" Joined: " + this.joinYear +
			". Address: " + this.address;
		return info;
	}
}
