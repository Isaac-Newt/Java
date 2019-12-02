package ex_2_student_interface;

public class Grad <T, U> implements StudentInt<T, U> {

	@Override
	public void displayStudent(T t, U u) {
		System.out.print(t + " ");
		System.out.println(u);
	}

}
