package java_project_2;

public class ArrayExample {

    public static void main(String[] args) {
        // An array is a collection of values OF THE SAME TYPE
        // Elements can be randomly accessed by using an index
        // Arrays are initialized with a set number of cells
        
        // Declare an array
        int[] arrayOfInts;
        
        // Initialize with a set number of cells
        arrayOfInts = new int[100];
        
        // Set the value of the cell at index 37
        // Value must match the initialized data type!
        arrayOfInts[37] = 204;
        
        // Can find the length of the array (all cells)
        System.out.println(arrayOfInts.length);
        
        // FOR EACH LOOP
        // A for each loop allows you to iterate over an array
        
        /*
        Equivalent Python:
        
        list = [4, 5, 12, 25]
        for item in list:
            print(item)
         */
        
        // Define an array
        int [] arrayTwo = {4, 5, 12, 25};
        
        // For each element in the array, print the element
        for (int x: arrayTwo) {
            System.out.println(x);
        }
        
        // "Grow" an array
        // In order to increase the size of the array, one must
        // redefine the array, as follows:
        
        // Define too-small array
        String[] favoriteAnimals = new String[2];
        
        // Allocate new memory to the "favoriteAnimals" array
        favoriteAnimals = new String[] {"Frog", "Turtle", "Fish"};
    
    }

}
