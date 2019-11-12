package object_class_example;

public class Key {

    // Declare data members
    private String firstName;
    private String lastName;
    
    // Constructor
    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    // Getters and Setters
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
    
    // Object Class Overrides
    @Override
    public String toString() {
        return this.firstName + this.lastName;
    }
    
    @Override
    public boolean equals(Object key) {
        // return boolean variable, default to not equal
        boolean equals = false;
        
        // Takes any object as input, and casts it as an employee object
        Key testKey = (Key)key;
        
        // Comparison
        if (this.firstName.equals(testKey.firstName) &&
            this.lastName.equals(testKey.lastName)) {
            equals = true;
        }
        
        return equals;
    }
    
    @Override
    public int hashCode() {
        // This uses the hash method recommended in the Joshua Blue book
        int hash = 7;
        hash = 31 * hash + (firstName == null ? 0:firstName.hashCode());
        hash = 31 * hash + (lastName == null ? 0:lastName.hashCode());
        return hash;
    }
}
