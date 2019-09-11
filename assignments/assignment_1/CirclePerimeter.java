/*
 * Isaac List
 * Assignment 1
 * Problem 4
 */

import java.util.Scanner;
 
// package assignment_1;

public class CirclePerimeter {

    public static void main(String[] args) {

        // Use scanner to get radius from user
        double radius = getRadiusInput();

        // Initialize the circumference and area as floats
        double circumference, area;

        // Calculate the circumference and area
        circumference = 2.0 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        // Print the results to the console
        System.out.println("Circumference is: " + circumference);
        System.out.println("Area is : " + area);

    }

    public static double getRadiusInput() {

        // Initialize scanner for user input
        Scanner scannerInput = new Scanner(System.in);

        // Get radius from the user
        System.out.print("Enter the radius: ");
        double radius = scannerInput.nextDouble();

        // Close the scanner
        scannerInput.close();

        // Return the radius
        return radius;

    }

}
