package exercise_1_2_4_student;

// Functional interface, provides exactly 1 abstract method

@FunctionalInterface
public interface Student {

    // Can have no more than one abstract method
    public abstract void taskOne();
    
    // May include default methods
    public default void taskTwo() {
        System.out.println("Take exams");
    }
    
    /*
     * Produces an error:
     * 
     * public abstract void taskThree();
     */
    
}
