package object_class_example;

public class Employee {
    
    // Declare data members
    private int ID;
    private String firstName;
    private String lastName;

    // Constructors
    public Employee() {
        // Default constructor
    }
    
    // Populate data
    public Employee(int id, String fname, String lname) {
        this.ID = id;
        this.firstName = fname;
        this.lastName = lname;
    }
    
    // Getters and Setters
    public int getID() {
        return this.ID;
    }
    
    public void setID(int newID) {
        this.ID = newID;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String newName) {
        this.firstName = newName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String newName) {
        this.lastName = newName;
    }
    
    // Override Object Class's default methods
    @Override
    public String toString() {
        return this.ID + this.firstName + this.lastName;
    }
    
    @Override
    public boolean equals(Object emp) {
        // return boolean variable, default to not equal
        boolean equals = false;
        
        // Takes any object as input, and casts it as an employee object
        Employee testEmp = (Employee)emp;
        
        // Comparison
        if (this.ID == testEmp.ID &&
            this.firstName.equals(testEmp.firstName) &&
            this.lastName.equals(testEmp.lastName)) {
            equals = true;
        }
        
        return equals;
    }
    
}
