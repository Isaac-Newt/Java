/*
 * Use overloaded methods to allow for the same method call
 * to be passed to different methods based on the parameters
 *
 * This is useful, as it allows similar functions to be used
 * with the same method call. It helps label general methods
 * that may be useful with a variety of parameters.
 */

public class OverloadExample {
    void overloadExample() {
        System.out.println("No parameters passed");
    }

    void overloadExample(int p1) {
        System.out.println("Parameters passed: " + p1);
    }

    void overloadExample(int p1, int p2) {
        System.out.println("Parameters passed: " + p1 + " " + p2);
    }

    void overloadExample(String p3) {
        System.out.println("Parameters passed: " + p3);
    }
}
