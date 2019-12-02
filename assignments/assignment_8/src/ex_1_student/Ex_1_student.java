package ex_1_student;

public class Ex_1_student <T, U> {

	// Declare data member with a Generic type
    private T studentID;
    private U studentMajor;

    // Constructor also takes data type of Generic T
    public Ex_1_student(T ID, U major) {
        this.studentID = ID;
        this.studentMajor = major;
    }
	
}
