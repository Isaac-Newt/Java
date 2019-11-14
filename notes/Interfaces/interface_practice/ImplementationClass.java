package interface_practice;

public class ImplementationClass extends SuperClass implements Interface {

    // Optional override
    @Override
    public void greetingsWorld() {
        System.out.println("Greetings World");
    }
    
    // Required override
    @Override
    public void salutationsWorld() {
        System.out.println("Salutations World");
        
    }

    @Override
    public void acknowledgementWorld() {
        System.out.println("Acknowledgement World");
        
    }
    
}
