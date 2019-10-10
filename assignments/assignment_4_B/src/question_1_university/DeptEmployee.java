package question_1_university;

public abstract class DeptEmployee {
	// Declare data members
	private String name;
	private String hireDate;
	private double salary;
	
	// Constructor
	DeptEmployee(String name, String hire, double salary) {
		this.name = name;
		this.hireDate = hire;
		this.salary = salary;
	}
	
	// Define compute salary method
	public double computeSalary() {
		return this.salary;
	}

	// Define getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
