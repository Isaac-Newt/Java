package objects_classes;

public class JavaClass {

    // Declare attributes
    public int classroom;
    private int enrollmentCap;
    protected String instructor;
    protected String courseName;
    // This will be a default value, may be reassigned by the constructor
    private String materials = "Book";

    public JavaClass(int room, int cap, String prof, String name) {
        // you can call another constructor, such calls should come first
        this(prof);

        // initialize object attributes with above variables
        this.classroom = room;
        this.enrollmentCap = cap;
        this.courseName = name;
    }

    public JavaClass(String prof) {
        // Another constructor, called from previous constructor
        this.instructor = prof;
    }

    public String toString() {
        // Prints course name as a string
        return this.courseName;
    }

    // Define getters and setters for enrollmentCap
    // These MUST be public methods (otherwise basically useless)
    public int getEnrollmentCap() {
        return this.enrollmentCap;
    }

    public int setEnrollmentCap(int newCap) {
        return this.enrollmentCap = newCap;
    }

    public String getMaterials() {
        return this.materials;
    }

}
