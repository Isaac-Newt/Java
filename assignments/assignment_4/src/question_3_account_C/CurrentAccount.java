package question_3_account_C;

public class CurrentAccount extends Account_Impl {
    // Constructor
    CurrentAccount(String title, String bName, String type, double amt) {
        super(title, bName, type, amt);
    }

    // Override profit method
    public double getProfit() {
        return this.getAmount() * 0.15;
    }
}
