package exercise_1_2_4_student;

/*
 * This class shows the three ways to implement a functional interface,
 * either with an implementation class, anonymous class, or lambda expression
 */

public class Main {

    public static void main(String[] args) {
        
        // Student using implementation class (Exercise 1)
        Student yourStudent = new StudentClass();
        
        yourStudent.taskOne();
        
        // Anonymous class to implement the student interface (Ex. 2)
        Student Daniel = new Student() {
            @Override
            public void taskOne() {
                System.out.println("Do homework");
            }
        };
        
        // Lambda expression (Exercise 4)
        Student Riley = () -> {
        	System.out.println("Do Homework!");
        };
        
        Daniel.taskOne();
        
    }

}
