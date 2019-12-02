package ex_2_student_interface;

public class UnderGrad implements StudentInt<String, Integer> {

	@Override
	public void displayStudent(String s, Integer i) {
		System.out.println(s + " " + i);
	}

}
