package ex_2_student_interface;

public class Main {

	public static void main(String[] args) {
		// Create a grad and undergrad
		UnderGrad Simon = new UnderGrad();
		Grad<String, Integer> John = new Grad<String, Integer>();
		
		Simon.displayStudent("Simon", 14329);
		John.displayStudent("John", 14933);
	}

}
