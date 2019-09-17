package java_project_2;

import java.util.Scanner;

public class displayNameWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Standard While Example
		System.out.print("Do you want to display your name? ");
		String answer = sc.nextLine();
		
		// cannot do answer == yes
		while (answer.equals("yes")) {
			System.out.print("Please enter your name: ");
			String name = sc.nextLine();
			System.out.println(name);
			
			System.out.print("Do you want to display your name? ");
			answer = sc.nextLine();
		}
		
		// Do-While Example
		
		System.out.print("Do you want to print an animal's name? ");
		String answer2 = sc.nextLine();
		
		do {
			System.out.print("Please enter your animal's name: ");
			String animalName = sc.nextLine();
			System.out.println(animalName);
			
			System.out.print("Do you want to print an animal's name? ");
			answer2 = sc.nextLine();
		}
		while (answer2.equals("yes"));
		
		sc.close();
		
	}

}
