// Isaac List - CS252 - September 23, 2019
// Program that takes in three ints, and decides whether the ints
// are entered in an increasing or decreasing order, or no order.

import java.util.Scanner;

class numbersInOrder {
    public static void main(String[] args) {
        // Open the Scanner
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.print("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int numberThree = scanner.nextInt();

        // Decide what order they are in
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("Increasing");
        }

        else {
            if (numberOne > numberTwo && numberTwo > numberThree) {
                System.out.println("Decreasing");
            }
            else {
                System.out.println("Neither increasing nor decreasing");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}