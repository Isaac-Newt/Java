package question_1_university;

public class Professor extends DeptEmployee {
	// Declare data members
	private int numberOfPublications;
	
	// Constructor
	Professor(String name, String date, double sal, int numPub) {
		super(name, date, sal);
		this.numberOfPublications = numPub;
	}
	
	// Define getter and setter
	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}
	
	public void setNumberOfPublications(int newNumber) {
		this.numberOfPublications = newNumber;
	}
}
