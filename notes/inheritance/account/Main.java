package account;

public class Main {

    public static void main(String[] args) {
        // Create objects of classes Savings and Current
        Savings savingsAccount = new Savings("Save", 1234, 100.0);
        Current currentAccount = new Current("Current", 1234, 100.0);
        
        // Print the profit for each account
        double savingsProfit = savingsAccount.Profit();
        double currentProfit = currentAccount.Profit();
        System.out.println(
            "Savings: $" + savingsProfit + " Current: $" + currentProfit
        );
    }

}
