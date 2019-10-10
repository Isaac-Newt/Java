package question_3_account_AB;

final class Account_Uninheritable {
    // Declare data members
    private String accountTitle;
    private String branchName;
    private String accountType;
    private double amount;

    // Constructor
    private Account_Uninheritable(String title, String bName, String type, double amt) {
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
