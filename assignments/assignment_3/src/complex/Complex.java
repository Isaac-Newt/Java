package complex;

import java.util.Scanner;

public class Complex {
	public static void main(String[] args) {
		// Get user input for what to do 
		Scanner choice_scanner = new Scanner(System.in);
		System.out.println("(Enter m for multiply, d for divide, a for add, s for subtract");
		System.out.print("What would you like to do?: ");
		String choice = choice_scanner.nextLine();
		choice_scanner.close();
		
		switch (choice) {
			case "m":
				String answer_m = multiply();
				System.out.println(answer_m);
				break;
			case "d":
				String answer_d = divide();
				System.out.println(answer_d);
				break;
			case "a":
				String answer_a = add();
				System.out.println(answer_a);
				break;
			case "s":
				String answer_s = subtract();
				System.out.println(answer_s);
				break;
			default:
				System.out.println("Please enter a valid choice.");
				main(args);
				break;
		}
	}
	
	private static int getRealComponent() {
		Scanner real_scanner = new Scanner(System.in);
		System.out.print("Enter the real-number component: ");
		int real_component = real_scanner.nextInt();
		real_scanner.close();
		
		return real_component;
	}
	
	private static int getImaginaryComponent() {
		Scanner imaginary_scanner = new Scanner(System.in);
		System.out.print("Enter the imaginary-number component (# before i, include the '-' if necessary): ");
		int imaginary_component = imaginary_scanner.nextInt();
		imaginary_scanner.close();
		
		return imaginary_component;
	}
	
	private static String multiply() {
		System.out.println("Enter the first complex number.");
		int real_component_1 = getRealComponent();
		int imaginary_component_1 = getImaginaryComponent();
		
		System.out.println("Enter the second complex number.");
		int real_component_2 = getRealComponent();
		int imaginary_component_2 = getImaginaryComponent();
		
		int real_component = (real_component_1 * real_component_2)
				- (imaginary_component_1 * imaginary_component_2);
		int imaginary_component = (real_component_1 * imaginary_component_2)
				+ (imaginary_component_1 * real_component_2);
		
		String real_component_str = Integer.toString(real_component);
		String imaginary_component_str = Integer.toString(imaginary_component);
		
		return real_component_str + " + " + imaginary_component_str + "i";
	}

	private static String divide() {
		System.out.println("Enter the first complex number.");
		int real_component_1 = getRealComponent();
		int imaginary_component_1 = getImaginaryComponent();
		
		System.out.println("Enter the second complex number.");
		int real_component_2 = getRealComponent();
		int imaginary_component_2 = getImaginaryComponent();
		
		// TODO: Divide the complex number
		
		return"";
	}

	private static String add() {
		System.out.println("Enter the first complex number.");
		int real_component_1 = getRealComponent();
		int imaginary_component_1 = getImaginaryComponent();
		
		System.out.println("Enter the second complex number.");
		int real_component_2 = getRealComponent();
		int imaginary_component_2 = getImaginaryComponent();
		
		int real_component = real_component_1 + real_component_2;
		int imaginary_component = imaginary_component_1 + imaginary_component_2;
		
		String real_component_str = Integer.toString(real_component);
		String imaginary_component_str = Integer.toString(imaginary_component);
		
		return real_component_str + " + " + imaginary_component_str + "i";
	}
	
	private static String subtract() {
		System.out.println("Enter the first complex number.");
		int real_component_1 = getRealComponent();
		int imaginary_component_1 = getImaginaryComponent();
		
		System.out.println("Enter the second complex number.");
		int real_component_2 = getRealComponent();
		int imaginary_component_2 = getImaginaryComponent();
		
		int real_component = real_component_1 - real_component_2;
		int imaginary_component = imaginary_component_1 - imaginary_component_2;
		
		String real_component_str = Integer.toString(real_component);
		String imaginary_component_str = Integer.toString(imaginary_component);
		
		return real_component_str + " + " + imaginary_component_str + "i";
	}
}
