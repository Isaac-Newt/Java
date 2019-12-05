package functional_interface;

@FunctionalInterface
public interface Functional {
    // 1 and only 1 method in this interface
    void myMethod(String t);
    
    // Cannot have the below line included:
    // int anotherMethod(int x);
}
