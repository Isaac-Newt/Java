package question_2_books;

public class ScientificTransaction extends Book {
    // Declare extra data members
    private String conferenceName;
    private String Date;
    private String Location;
    private int Expense;

    // Constructor
    ScientificTransaction(
        String title, String auth, String pub, int num, int pr, String conf, String dt, String loc, int exp
    ) {
        super(title, auth, pub, num, pr);
        this.conferenceName = conf;
        this.Date = dt;
        this.Location = loc;
        this.Expense = exp;
    }

    @Override
    public int pricePerCopy() {
        int pricePerCopy = this.getNumberOfPages() / this.getExpense();
        return pricePerCopy;
    }

    public int getExpense() {
        return this.Expense;
    }
}
