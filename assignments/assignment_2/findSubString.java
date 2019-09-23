// Isaac List - CS252 - September 23, 2019
// Program to determine if a string contains a given substring

import java.util.Scanner;

class findSubString {

    public static void main(String[] args) {
        // Open the scanner
        Scanner sc = new Scanner(System.in);

        // Get the user's string and substring
        System.out.print("Enter a string: ");
        String testString = sc.nextLine();
        System.out.print("Enter a substring to find: ");
        String subString = sc.nextLine();
        
        // use the String.contains() method
        boolean found = testString.contains(subString);
        System.out.println(found);

        // Close the scanner
        sc.close();
    
    }

}
