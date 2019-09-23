// Program to print "Array Leaders", numbers in an array
// that are larger than all the numbers to the right.

import java.util.Scanner;
import java.util.Arrays;

class arrayLeaders {

    public static void main(String[] args) {
        // Open the scanner
        Scanner scanner = new Scanner(System.in);

        // Build an array of 7 ints from user input
        System.out.print("Enter a number to add to the array: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number5 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number6 = scanner.nextInt();
        System.out.print("Enter a number to add to the array: ");
        int number7 = scanner.nextInt();

        int[] newArray = new int[] {
            number1, number2, number3, number4, number5, number6, number7
        };

        int[] arrayOfLeads = new int[7];

        // For each item in the array, compare to each item to the right
        int i;
        int index = 0;
        for (i = 0; i < 7; i++) {
            int candidate = newArray[i];
            boolean lead = true;
            int j;
            for (j = i + 1; j < 7; j++) {
                int compare = newArray[j];
                if (compare > candidate) {
                    lead = false;
                }
            }
            if (lead) {
                arrayOfLeads[index] = candidate;
                index++;
            }
        }

        // Print out the leads
        int k;
        for (k = 0; k < arrayOfLeads.length; k++) {
            if (arrayOfLeads[k] != 0) {
                System.out.print(arrayOfLeads[k] + " ");
            }
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }

}