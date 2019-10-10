package question_4_person;

public class Student extends Affiliation implements Person, Interests {
    // Constructor
    Student(String institute, String address, String sport, String title) {
        super(institute, address);
    }

    // Implement abstract methods
    @Override
    public void Sports(String sportName) {
        System.out.println("I play " + sportName);
    }

    @Override
    public void Profession(String title) {
        System.out.println("I am a " + title);
    }

    // Override toString
    @Override
    public String toString() {
        this.Sports("Tennis");
        this.Profession("Librarian");
        return ("Student attends " + this.getInstitute() + " and lives at " + this.getAddress());
    }
}
