package triangle_parameters;

import triangle_parameters.Triangle;

public class Main {
    public static void main(String[] args) {
        // Create a new Triangle with parameters
        Triangle tri = new Triangle(3, 4, 5);

        // Print the side lengths
        tri.toString();
    }
}
