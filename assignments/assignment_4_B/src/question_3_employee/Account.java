package question_3_employee;

public abstract class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	
	Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public abstract String getAcctType();
	
	public abstract String toString();

	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	
	public boolean makeWithdrawal(double amount) {
		if((amount) <= balance) {
			balance -= (amount);
			return true;
		}
		return false;
	}
}
