package area_constructor;

public class AreaConstructor {
	// Define data members
	private int width;
	private int height;
	
	// Define the constructor
	AreaConstructor(int width, int height) {
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
