package question_2_books;

public abstract class Book {
    // Declare data members
    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;
    private int price;
    
    // Define constructor
    Book(String title, String auth, String pub, int num, int price) {
        this.title = title;
        this.author = auth;
        this.publisher = pub;
        this.numberOfPages = num;
        this.price = price;
    }
    
    // Declare abstract method price per copy
    abstract int pricePerCopy();
    
    // Define getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }    
}
