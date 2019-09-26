package account;

public class Account {

    // Declare data members
    protected String Title;
    protected int Number;
    protected double Amount;
    
    // Constructor
    Account(String title, int number, double amount) {
        this.Title = title;
        this.Number = number;
        this.Amount = amount;
    }
    
    // Profit method
    protected double Profit() {
        return this.Amount * 0.1;
    }
    
}
