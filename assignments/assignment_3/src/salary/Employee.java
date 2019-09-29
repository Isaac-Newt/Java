package salary;

public class Employee {
	// Declare data members
	private int Salary;
	private int hoursPerDay;
	
	Employee(int salary, int hours) {
		this.Salary = salary;
		this.hoursPerDay = hours;
	}
	
	public void getInfo() {
		System.out.println("Salary: " + this.Salary + " Hours: " + this.hoursPerDay);
	}
	
	public void addSal() {
		if (this.Salary < 500) this.Salary += 10;
	}
	
	public void addWork() {
		if (this.hoursPerDay > 6) this.Salary += 5;
	}
}
