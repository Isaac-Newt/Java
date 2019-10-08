// Start with package declaration
package examples;

// Next, import any utilities
import java.util.Scanner;

// Next, declare the class (same name as .java filename)
public class Syntax {
    // Define data members
    private int public_number;
    private int private_number;

    // Class may have main(), or may not (there must be a main() class
    // associated with the class if main() is absent)

    // Define a constructor to be used to create an object of this class

    // Demonstrating method overloading, by defining the same method name
    // that can be called with different sets of parameters
    Syntax() {
        this.public_number = 100;
        this.private_number = 50;
    }

    Syntax(int pub, int priv) {
        // "This" indicates that the variable belongs to the instance
        // object of the class (must be accessed in such context)
        this(priv);
        this.public_number = pub;
    }

    private Syntax(int priv) {
        this.private_number = priv;
    }

    // Define member method(s)
    public String Hello() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        // Resources must be closed to release memory
        scan.close();

        System.out.println("Hello " + name);
        // Java methods may only return one value
        return name;
    }

    public String Hello_Parameters(String name) {
        return "Hello " + name;
    }
}
