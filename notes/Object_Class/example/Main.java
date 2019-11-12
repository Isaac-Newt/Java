package object_class_example;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        // Create two employees
        Employee emp1 = new Employee(1, "Daniel", "Smith");
        Employee emp10 = new Employee(1, "Daniel", "Smith");
        Employee emp2 = new Employee(2, "Daisy", "Jones");
        
        // Use toString method
        System.out.println(emp1);
        System.out.println(emp2);
        
        // Use equal method
        System.out.println(emp1.equals(emp10));
        
        // Hash table example
        
        // Create the hash table
        Hashtable hash = new Hashtable();
        
        // Create two theoretically identical keys
        Key key1 = new Key(emp1.getFirstName(), emp1.getLastName());
        Key key10 = new Key(emp10.getFirstName(), emp10.getLastName());
        
        // Create a third theoretically identical key manually
        Key key3 = new Key("Daniel", "Smith");
        
        // Add two keys to the hash table
        hash.put(key1, emp1);
        hash.put(key10, emp10);
        
        // Look for the third key in the hash table
        System.out.println(hash.containsKey(key3));
    }

}
