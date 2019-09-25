package student;

public class Main {
    public static void main(String[] args) {
        // Create two students, John and Sam
        Student John = new Student("John", "123 Main Street", "555-1234", 2);
        Student Sam = new Student("Sam", "417 Water Street", "555-9410", 1);

        // Print the students' information
        John.toString();
        Sam.toString();
    }
}
