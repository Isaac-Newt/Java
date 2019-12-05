package functional_interface;

/*
 * A functional interface is designed to allow a single
 * method to be inherited by an implementation class,
 * without the overhead of an entire interface.
 */

@FunctionalInterface
public interface Functional_Interface {

    // Can have up to one abstract method
    public abstract void myFunction();
    
    // May have additional default methods
    public default void yourFunction() {
        System.out.println("Hello World");
    }
    
}
