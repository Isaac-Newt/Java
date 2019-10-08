package object_oriented_design;

public class Main {
    public static void main(String[] args) {
        // Create an object of class Example
        Example example = new Example(1, 2);

        // Use the methods of the class
        System.out.println(example.toString());
        example.setPrivateNumber(10);
        example.setProtectedNumber(20);
        System.out.println(example.toString());

        // Demonstrate Control Flow statements
        controlFlow();
    }

    private static void controlFlow() {
        // All of these loops will do the same thing: print 1-5
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i ++;
        }

        i = 0;
        do {
            System.out.println(i);
            i ++;
        }
        while (i < 5);
    }
}
