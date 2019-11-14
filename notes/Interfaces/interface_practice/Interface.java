package interface_practice;

public interface Interface {
    
    // This class cannot be overridden, but will be inherited
    public static void helloWorld() {
        System.out.println("Hello World");
    }
    
    // This class can (but doesn't have to) be overridden, and will be inherited
    public default void greetingsWorld() {
        System.out.println("Greetings World");
    }
    
    // This method must be implemented by the implementation class
    public abstract void salutationsWorld();
    
    // Same thing as previous, abstract key is not necessary in an interface
    public void acknowledgementWorld();
    
    // This method clashes with the superclass method, so won't be used
    public default void formalitiesWorld() {
        System.out.println("Formalities World");
    }
    
}
