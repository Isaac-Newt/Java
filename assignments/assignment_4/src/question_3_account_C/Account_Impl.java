package question_3_account_C;

public abstract class Account_Impl implements Account {
    // Declare data members
    private String accountTitle;
    private String branchName;
    private String accountType;
    private double amount;

    // Constructor
    Account_Impl(String title, String bName, String type, double amt) {
        this.accountTitle = title;
        this.branchName = bName;
        this.accountType = type;
        this.amount = amt;
    }

    // Define abstract method
    public abstract double getProfit();

    // Define getters and setters
    public String getAccountTitle() {
        return accountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
