package triangle_parameters;

public class Triangle {
	// Declare data members of the Triangle class
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    // Constructor with parameters
    Triangle(int one, int two, int three) {
    	this.sideOne = one;
    	this.sideTwo = two;
    	this.sideThree = three;
    }

    // Method to display area and perimeter of the Triangle
    public String toString() {
    	// Calculate area and perimeter
    	int perimeter = perimeter();
    	double area = area(perimeter/2);
    	
        System.out.println("Area: " + area + " Perimeter: " + perimeter);
        return "";
    }
    
    // Calculate area with Heron's Formula
    public double area(double p) {
    	double area;
    	double a = p - this.sideOne;
    	double b = p - this.sideTwo;
    	double c = p - this.sideThree;
    	area = Math.sqrt(p * a * b * c);
    	return area;
    }
    
    // Perimeter = sum of all sides
    public int perimeter() {
    	int perimeter =  this.sideOne + this.sideTwo + this.sideThree;
    	return perimeter;
    }
}
