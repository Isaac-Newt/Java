package question_3_employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {

    private ArrayList<Account> accounts;
	private String name;
	@SuppressWarnings("unused")
	private LocalDate hireDate;
	
	public Employee(String name, ArrayList<Account> accounts, int yearOfHire, int monthOfHire, int dayOfHire){
	    this.accounts = accounts;
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		Account checkingAcct = new CheckingAccount(startAmount);
		accounts.add(checkingAcct);
	}

	public void createNewSavings(double startAmount) {
		Account savingsAcct = new SavingsAccount(startAmount);
		accounts.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAcct = new RetirementAccount(startAmount);
		accounts.add(retirementAcct);
		
	}

	public String getFormattedAcctInfo() {
		String newline = "\n";
		String theString = "ACCOUNT INFO FOR "+name+newline+newline;
		for(int i = 0; i < 3; i++) {
		    theString += accounts.get(i).toString() + newline;
		}
		
		return theString;
	}
	
	public void deposit(int acctIdx, double amt){
	    // Identify the selected account
	    Account selected = this.accounts.get(acctIdx);
	    selected.makeDeposit(amt);
	}
	
	public boolean withdraw(int acctIdx, double amt){
        // Identify the selected account
        Account selected = this.accounts.get(acctIdx);
        return selected.makeWithdrawal(amt);
	}

}
