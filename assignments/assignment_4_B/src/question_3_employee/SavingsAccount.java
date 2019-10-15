package question_3_employee;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAcctType() {
        return "Savings Account";
    }

    @Override
    public String toString() {
        String newline = System.getProperty("line.separator");
        return "Account type: " + this.getAcctType()
                + newline +
                "Current bal: " + this.getBalance();
    }

}
