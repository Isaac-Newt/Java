package question_3_account_AB;

public class Account_Inheritable {
    // Declare data members
    private String accountTitle;
    private String branchName;
    private String accountType;
    private double amount;

    // Constructor
    Account_Inheritable(String title, String bName, String type, double amt) {
        this.accountTitle = title;
        this.branchName = bName;
        this.accountType = type;
        this.amount = amt;
    }

    public double calculateProfit() {
        return this.amount;
    }

    // Define getters and setters
    public String getAccountTitle() {
        return accountTitle;
    }
    public String getBranchName() {
        return branchName;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getAmount() {
        return amount;
    }
}
