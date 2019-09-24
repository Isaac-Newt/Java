package student_exercise;

public class Student {
    
    // Initialize the data members
    private String Name;
    private int ID;
    private int Age;
    private String Major;
    private String Address;
    
    // Constructor
    public Student(String name, String major, String address, int id, int age) {
        this.Name = name;
        this.ID = id;
        this.Age = age;
        this.Major = major;
        this.Address = address;
    }
    
    // To-String method to display student's information
    public String toString() {
        System.out.println(
            this.Name + " is " + this.Age + " years old, has an ID number " 
            + this.ID + ", lives at " + this.Address + ", and is majoring in "
            + this.Major
        );
        
        return "";
    }
    
    // Auto-generated getters & setters
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor(String major) {
        Major = major;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    
    
}
