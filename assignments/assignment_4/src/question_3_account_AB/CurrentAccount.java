package question_3_account_AB;

public class CurrentAccount extends Account_Inheritable {
    // Constructor
    CurrentAccount(String title, String bName, String type, double amt) {
        super(title, bName, type, amt);
    }

    // Override profit method
    @Override
    public double calculateProfit() {
        return this.getAmount() * 0.15;
    }
}
