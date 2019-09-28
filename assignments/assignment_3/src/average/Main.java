package average;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Get three values from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an int: ");
		int val_1 = sc.nextInt();
		System.out.print("Enter an int: ");
		int val_2 = sc.nextInt();
		System.out.print("Enter an int: ");
		int val_3 = sc.nextInt();
		sc.close();
		
		// Create an object of class Average
		Average avg = new Average(val_1, val_2, val_3);
		avg.calculateAverage();
	}

}
