package employee;

public class Main {

	public static void main(String[] args) {
		// Create three objects of class employee
		Employee robert = new Employee("Robert", "1994", "64C Wall Street");
		Employee sam = new Employee("Sam", "2000", "68D Wall Street");
		Employee john = new Employee("John", "1999", "26B Wall Street");
		
		// Print the employees' info
		System.out.println(robert.toString());
		System.out.println(sam.toString());
		System.out.println(john.toString());
	}

}
