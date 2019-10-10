package question_1_university;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create objects of classes Professor and Secretary
		Professor Anne = new Professor("Anne", "2011", 60000, 3);
		Professor James = new Professor("James", "2015", 50000, 1);
		Professor Carol = new Professor("Carol", "2004", 80000, 6);
		
		Secretary John = new Secretary("John", "2009", 45000, 14);
		Secretary Lana = new Secretary("Lana", "2017", 35000, 8);
		
		// Set professor publications to 10
		Anne.setNumberOfPublications(10);
		James.setNumberOfPublications(10);
		Carol.setNumberOfPublications(10);
		
		// Set secretary overtime to 200
		John.setOvertimeHours(200);
		Lana.setOvertimeHours(200);
		
		// Create an array of Department Employees
		DeptEmployee[] department = new DeptEmployee[5];
		
		// Run the view total of salaries function
		totalSalaries(department);
	}
	
	public static void totalSalaries(DeptEmployee[] employeeList) {
		// Open the scanner
		Scanner scan = new Scanner(System.in);
		
		// Ask if user would like to see total salaries
		System.out.print("Would you like to see the total of all salaries? (y/n): ");
		String answer = scan.nextLine();
		
		// Close the scanner
		scan.close();
		
		// Make decision based on answer
		if (answer.equals("y")) {
			double totalSalary = 0.0;
			for (int i = 0; i < 5; i++) {
				double personSalary = employeeList[i].computeSalary();
				totalSalary = totalSalary + personSalary;
			}
			
			System.out.println("The total of the salaries is " + totalSalary);
		}
	}

}
