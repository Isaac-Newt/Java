package question_2_closed_curve;

public class Rectangle extends ClosedCurve {
	// Declare data members
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	double computeArea() {
		return this.width * this.length;
	}

}
