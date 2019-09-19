package student;

public class Student {

    // Declare the attributes
    private int age;
    private int ID;
    private String name;
    private String major;
    // This is a global attribute
    private String school = "Luther";
    
    public Student() {
        
    }
    
    // Constructor
    public Student(int age, int ID, String name, String major) {
        this.age = age;
        this.ID = ID;
        this.name = name;
        this.major = major;
    }

    // Automatically generated getters and setters :)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
}
