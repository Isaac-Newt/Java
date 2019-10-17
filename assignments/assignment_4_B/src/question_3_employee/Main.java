package question_3_employee;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main() {
		emps = new Employee[3];
		ArrayList<Account> acc = new ArrayList<Account>();
		emps[0] = new Employee("Jim Daley", acc, 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", acc, 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", acc, 1997, 2,13);
	      
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
//		for phase I � console output
		Scanner sc = new Scanner(System.in);
		System.out.println("A: See a report of all balances");
		System.out.println("B: Make a deposit");
		System.out.println("C: Make a withdrawal");
		System.out.print("Select an option (A, B, or C): ");
		String answer = sc.next();
		sc.close();
		
		if(answer.equalsIgnoreCase("A")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		
		else if (answer.equalsIgnoreCase("B")) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + ": " + emps[i].toString());
			}
			
			System.out.print("Select an employee: ");
			int employee = sc.nextInt();
			
			System.out.print("Select an account: ");
			int accountType = sc.nextInt();
			 
			
			System.out.print("Deposit amount: ");
			float depositAmount = sc.nextFloat();
			
			// Make a deposit in the selected employee's selected account
			emps[employee].deposit(accountType, depositAmount);
			System.out.println("$" + depositAmount + " has been deposited in the " + "" + " of " + emps[employee]);
		}			
		
		else if (answer.equalsIgnoreCase("C")) {

			for (int i = 0; i < 3; i++) {
				System.out.println(i + ": " + emps[i].toString());
			}
			
			System.out.print("Select an employee: ");
			int employee = sc.nextInt();
			
			System.out.print("Select an account: ");
			int accountType = sc.nextInt();
			 
			System.out.print("Deposit amount: ");
			float withdrawAmount = sc.nextFloat();
			
			// Make a deposit in the selected employee's selected account
			emps[employee].withdraw(accountType, withdrawAmount);
			System.out.println("$" + withdrawAmount + " has been withdrawn from the " + "" + " of " + emps[employee]);
		}
	}
	String getFormattedAccountInfo() {
		String retVal = "";
		for(int i = 0; i < emps.length; ++i){
			retVal += (emps[i].getFormattedAcctInfo() + "\n");
		}
		return retVal;
	}
}


