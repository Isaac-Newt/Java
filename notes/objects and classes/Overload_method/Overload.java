/*
 * Use overloaded methods to allow for the same method call
 * to be passed to different methods based on the parameters
 *
 * This is useful, as it allows similar functions to be used
 * with the same method call. It helps label general methods
 * that may be useful with a variety of parameters.
 */

public class Overload {
    public static void main(String args[]) {
        OverloadExample example = new OverloadExample();

        example.overloadExample();
        example.overloadExample(14);
        example.overloadExample(153, 59);
        example.overloadExample("Hello World!");
    }
}
