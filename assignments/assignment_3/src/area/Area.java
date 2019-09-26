package area;

import java.util.Scanner;

public class Area {
	// Declare data members
	private int width;
	private int height;
	
	// Set dimensions of the rectangle
	public void setDimensions() {
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Get input for width and height
		System.out.print("Enter rectangle width: ");
		int width = scanner.nextInt();
		System.out.print("Enter rectangle height: ");
		int height = scanner.nextInt();
		
		// Close the scanner
		scanner.close();
		
		// Initialize data members
		this.width = width;
		this.height = height;
	}
	
	// Print the area
	public String toString() {
		int area = this.width * this.height;
		System.out.println("The area of the rectangle is: " + area);
		
		return "";
	}
}
