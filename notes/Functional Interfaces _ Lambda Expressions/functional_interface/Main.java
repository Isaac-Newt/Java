package functional_interface;

/*
 * This class shows the two ways to implement a functional interface,
 * either with an implementation class, or an anonymous class.
 */

public class Main {

    public static void main(String[] args) {
        
        // Student using implementation class
        Student yourStudent = new StudentClass();
        
        yourStudent.taskOne();
        
        // Anonymous class to implement the student interface
        Student myStudent = new Student() {
            @Override
            public void taskOne() {
                System.out.println("Do homework");
            }
        };
        
        myStudent.taskOne();
        
    }

}
