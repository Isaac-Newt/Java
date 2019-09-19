/*
 * Isaac List
 * 
 * Example class to build a "Box" with width, height, and depth.
 * Demonstrates constructor, as well as class and method syntax.
 */

class boxObjectExample {
    // A class to create a box object

    // Declare box attributes
    double width, height, depth;

    // Box constructor method, name must match class name
    boxObjectExample(double w, double h, double d) {
        // "this" isn't required, but is used to refer
        // to the current object instance's attributes
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Method to calculate and return the Box's volume
    double volume() {
        // Could technicall use this.width etc.
        return width * height * depth;
    }

}


class BoxDemo {
    // A demo that will create an instance of Box

    public static void main(String[] args) {

        // Declare a new Box object, pass 3 parameters (w, h, d)
        boxObjectExample myNewBox = new boxObjectExample(4, 5, 6);

        // Print the volume of myNewBox
        System.out.println("Box volume is " + myNewBox.volume());

    }

}
