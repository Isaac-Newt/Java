package account;

public class Savings extends Account {
    
    // Constructor
    Savings(String name, int number, double amount) {
        super(name, number, amount);
    }
    
    // Override profit method
    @Override
    protected double Profit() {
        return this.Amount * 0.15;
    }
    
}
