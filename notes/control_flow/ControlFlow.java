package java_project_2;

public class ControlFlow {
	public static void main(String[] args) {
		// Basic if statement
		if (10 < 20) System.out.println("10 < 20");
		
		// Complex if statement
		if (10 < 20) {
			System.out.println("Complex statement");
			System.out.println("More than one statement");
		}
		
		// If-Else statement
		if (10 < 20) {
			System.out.println("10 is less than 20");
		}
		else {
			System.out.println("10 is not less than 20");
		}
		
		// Switch statement
		String myValue = "This is a string";
		switch(myValue) {
			case "Bye":
				System.out.println("Bye");
				break;
			case "Hello":
				System.out.println("Hello");
				break;
			default:
				System.out.println("Welcome");
				break;
		}
		
	}
}
