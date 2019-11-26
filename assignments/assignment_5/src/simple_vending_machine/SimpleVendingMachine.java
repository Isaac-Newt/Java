package simple_vending_machine;

import java.util.Scanner;

public class SimpleVendingMachine {
	// Main method
	public static void main(String[] args) {
		// Stock the vending machine
		Beverage Pepsi = new Beverage("Pepsi", 1.5, 5);
		Beverage Coke = new Beverage("Coke", 1.75, 5);
		Beverage Water = new Beverage("Water", 1.25, 10);
		
		// Add buttons
		Button PepsiButton = new Button(Pepsi);
		Button CokeButton = new Button(Coke);
		Button WaterButton = new Button(Water);
		
		// Open a scanner
		Scanner sc = new Scanner(System.in);
		
		// Interaction loop
		while (true) {
			// List the choices
			System.out.printf(
				"1: " + Pepsi.toString() + "%n" +
				"2: " + Coke.toString() + "%n" +
				"3: " + Water.toString() + "%n"
			);
			
			// Take money from the user
			System.out.print("Enter an amount: ");
			double inserted = sc.nextDouble();
			
			// Get user to "push" a button
			System.out.print("Select a beverage: ");
			int choice = sc.nextInt();
			
			// "Push" the button
			if (choice == 1) {
				PepsiButton.push(inserted);
			}
			else if (choice == 2) {
				CokeButton.push(inserted);
			}
			else if (choice == 3) {
				WaterButton.push(inserted);
			}
			else {
				System.out.println("Invalid Choice");
			}
		}
	}
}
