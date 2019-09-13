/*
 * Isaac List
 * Assignment 1
 * Problem 5
 */

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        
        // Initialize side count and side length
        double polygonArea;
        polygonArea = getUserInput();

        // Print the results to the console
        System.out.println("The area of the polygon is: " + polygonArea);

    }

    public static double getUserInput() {

        // Initialize scanner
        Scanner scannerInput = new Scanner(System.in);

        // Initialize local variables
        double sideCount, sideLength;

        // Get user input for side count and side length
        System.out.print("Enter the number of sides: ");
        sideCount = scannerInput.nextDouble();
        System.out.print("Enter the side length: ");
        sideLength = scannerInput.nextDouble();

        // Close scanner
        scannerInput.close();

        // Compute polygon area
        double polygonArea = computePolygonArea(sideCount, sideLength);

        // Return the area
        return polygonArea;

    }

    public static double computePolygonArea(double sides, double length) {

        // Initialize values, use num & den for readability
        double area, numerator, denominator;

        // Compute the area
        numerator = (sides * Math.pow(length, 2));
        denominator = (4 * Math.tan(Math.PI / sides));
        area = numerator / denominator;

        return area;

    }

}
