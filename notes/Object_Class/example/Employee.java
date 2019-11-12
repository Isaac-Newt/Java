package object_class_example;

public class Employee {
    
    // Declare data members
    private int ID;
    private String Name;

    // Constructors
    public Employee() {
        // Default constructor
    }
    
    // Populate data
    public Employee(int id, String name) {
        this.ID = id;
        this.Name = name;
    }
    
    // Getters and Setters
    public int getID() {
        return this.ID;
    }
    
    public void setID(int newID) {
        this.ID = newID;
    }

    public String getName() {
        return this.Name;
    }
    
    public void setName(String newName) {
        this.Name = newName;
    }
    
    // Override Object Class's default methods
    @Override
    public String toString() {
        return this.Name;
    }
    
    @Override
    public boolean equals(Object emp) {
        // return boolean variable, default to not equal
        boolean equals = false;
        
        // Takes any object as input, and casts it as an employee object
        Employee testEmp = (Employee)emp;
        
        // Comparison
        if (this.ID == testEmp.ID && this.Name.equals(testEmp.Name)) {
            equals = true;
        }
        
        return equals;
    }
    
}
