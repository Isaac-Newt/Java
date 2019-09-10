package java_project_2;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) throws IOException {
		// Initialize the scanner
		Scanner sc = new Scanner(System.in);
		
		// Initialize the integer input
		System.out.print("Enter a number: ");
		int usersInput = sc.nextInt();
		
		// Calculate the square and cube of the integer
		int usersInputSquare = usersInput * usersInput;
		int usersInputCube = usersInputSquare * usersInput;
		
		// Print out the square and cube of the integer
		System.out.println("The square of your number is: " + usersInputSquare);
		System.out.println("The cube of your number is: " + usersInputCube);
		sc.close(); 	
	}
}
