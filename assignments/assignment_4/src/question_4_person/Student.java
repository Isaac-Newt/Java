package question_4_person;

public class Student extends Affiliation implements Person, Interests {
    // I'm not quite sure what the interfaces are supposed to provide,
    // I would think methods, since they really shouldn't include data
    // members? But, I don't know what the methods should do then :\

    // Constructor
    Student(String institute, String address) {
        super(institute, address);
    }

    // Implement abstract methods
    @Override
    public void Sports(String sportName) {

    }

    @Override
    public void Profession(String title) {

    }

    // Override toString
    @Override
    public String toString() {
        return ("Student attends " + this.getInstitute() + " and lives at " + this.getAddress());
    }
}
