package question_1_university;

public class Secretary extends DeptEmployee {
	// Define data members
	private double overtimeHours;
	
	// Constructor
	Secretary(String name, String date, double sal, double hours) {
		super(name, date, sal);
		this.overtimeHours = hours;
	}
	
	// Override compute salary
	@Override
	public double computeSalary() {
		return (this.overtimeHours * 12) + super.computeSalary();
	}
	
	// Define getter and setter
	public double getOvertimeHours() {
		return this.overtimeHours;
	}
	
	public void setOvertimeHours(int newHours) {
		this.overtimeHours = newHours;
	}
}
