package question_4_person;

public class Affiliation {
    // Declare data members
    private String institute;
    private String address;

    // Constructor
    Affiliation(String institute, String address) {
        this.institute = institute;
        this.address = address;
    }

    // Define getters and setters
    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
