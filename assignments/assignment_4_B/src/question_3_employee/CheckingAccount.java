package question_3_employee;

public class CheckingAccount extends Account {

    CheckingAccount(double balance) {
        super(balance);
    }
    
    @Override
    public String getAcctType() {
        return "Checking Account";
    }
    
    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return "Account type: " + this.getAcctType()
                + newline +
                "Current bal: " + this.getBalance();
    }
    
    @Override 
    public double getBalance() {
        // Subtract a $5 monthly service charge
        this.makeWithdrawal(5);
        return super.getBalance();
    }
    
}