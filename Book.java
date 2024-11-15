// Practical Exercise: Creating the Book class
public class Book {
    // Private attributes
    private int book_number;
    private String title;
    private String author;
    private double price;

    // Setters and Getters for each attribute
    public void setBookNumber(int book_number) {
        this.book_number = book_number;
    }

    public int getBookNumber() {
        return book_number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}