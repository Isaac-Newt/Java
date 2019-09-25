package rectangle;

public class Rectangle {
	// Declare data members
	private int width;
	private int height;
	
	// Constructor
	Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	// Print the area
	public String toString() {
		int area = this.width * this.height;
		System.out.println("The area of the rectangle is: " + area);
		
		return "";
	}
}
