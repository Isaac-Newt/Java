package question_3_employee;

public class RetirementAccount extends Account {

    public RetirementAccount(double balance) {
        super(balance);
    }
    
    @Override
    public String getAcctType() {
        return "Retirement Account";
    }
    
    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return "Account type: " + this.getAcctType()
                + newline +
                "Current bal: " + this.getBalance();
    }
    
    @Override
    public boolean makeWithdrawal(double amount) {
        double penalty = 0.02 * this.getBalance();
        if((amount + penalty) <= this.getBalance()) {
            this.makeWithdrawal(amount + penalty);
            return true;
        }
        return false;
    }

}
