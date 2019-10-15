package question_3_employee;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	
	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType =acctType;
		System.out.println(this.acctType.type);
		this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);	
		
		
	}
	public double getBalance() {
		if (this.acctType.toString().equals("CHECKING")) {
			// Deduct $5 monthly services fee
			balance -= 5;
		}
		
		if (this.acctType.toString().equals("")) {
			// Add 0.25% monthly interest rate
			balance += (0.0025 * balance);
		}
		return balance;
	}
	
	public AccountType getAcctType() {
		return acctType;
	}
	public String toString() {
		String newline = System.getProperty("line.separator");
		return "Account type: "+ acctType.toString().toLowerCase()+
				newline +
				"Current bal: "+balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	public boolean makeWithdrawal(double amount) {
		double penalty = 0.0;
		if (acctType.toString().equals("")) {
			penalty = 0.02 * balance;
		}
		if((amount + penalty) <= balance) {
			balance -= (amount + penalty);
			return true;
		}
		return false;
	}
}
