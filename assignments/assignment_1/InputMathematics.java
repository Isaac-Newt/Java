/*
 * Isaac List
 * Assignment 1
 * Problem 2
 */

import java.util.Scanner;
import java.io.IOException;

public class InputMathematics {
    public static void main(String[] args) throws IOException {

        // Initialize the scanner
        Scanner scannerIn = new Scanner(System.in);

        // Get the integer inputs from the user
        System.out.print("Enter the first number: ");
        int intOne = scannerIn.nextInt();
        System.out.print("Enter the second number: ");
        int intTwo = scannerIn.nextInt();

        // Addition
        int added = intOne + intTwo;
        System.out.println(intOne + " + " + intTwo + " = " + added);

        // Subtraction
        int subtracted = intOne - intTwo;
        System.out.println(intOne + " - " + intTwo + " = " + subtracted);

        // Multiplication
        int multiplied = intOne * intTwo;
        System.out.println(intOne + " x " + intTwo + " = " + multiplied);

        // Division
        int divided = intOne / intTwo;
        System.out.println(intOne + " / " + intTwo + " = " + divided);

        // Remainder
        int remainder = intOne % intTwo;
        System.out.println(intOne + " mod " + intTwo + " = " + remainder);

    }
}
