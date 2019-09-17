package java_project_2;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        
        // Sort an array
        int[] arrayOfInts = {53, 15, 93, 104, 22, 41};
        Arrays.sort(arrayOfInts);
        
        // Copy an array
        String[] arrayOfStrings = {"Hello", "Hi", "Howdy"};
        String[] copyOfArray = new String[3];
        System.arraycopy(arrayOfStrings, 0, copyOfArray, 0, 3);

    }

}
