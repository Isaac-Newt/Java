// Program to replace portions of a string with
// a given sub-string.

import java.util.Scanner;

class replaceSubString {

    public static void main(String[] args) {
        // Open the scanner
        Scanner sc = new Scanner(System.in);

        // Get the string and substring and its replacement
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        System.out.print("Enter a substring to be replaced: ");
        String toReplace = sc.nextLine();

        System.out.print("Enter replacement string: ");
        String subString = sc.nextLine();

        // Replace instances of the 
        String newString = string.replaceAll(toReplace, subString);

        // Print the new string to the console
        System.out.println(newString);

        sc.close();

    }

}