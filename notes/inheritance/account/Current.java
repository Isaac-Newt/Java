package account;

public class Current extends Account {

    // Constructor
    Current(String name, int number, double amount) {
        super(name, number, amount);
    }
    
    // Override profit method
    @Override
    protected double Profit() {
        return this.Amount * 0.25;
    }
    
}
