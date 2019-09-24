package registration;

public class Registration {
    
    // Define data members
    int Date = 2019;
    String CourseID = "CS252";
    int StudentID = 000;
    int numRegistered;

    // Define member functions
    public void NumberOfStudents() {
        System.out.println(numRegistered);
    }
    
    // Define Getters & Setters
    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getNumRegistered() {
        return numRegistered;
    }

    public void setNumRegistered(int numRegistered) {
        this.numRegistered = numRegistered;
    }

}
