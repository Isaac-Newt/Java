package question_2_books;

public class Academic extends Book {
    // Constructor method
    Academic(String title, String auth, String pub, int num, int price) {
        super(title, auth, pub, num, price);
    }

    @Override
    int pricePerCopy() {
        return this.getPrice();
    }

}
