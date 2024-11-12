import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String genre;
    private double price;
    private int publicationYear;
    private String isbn;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, String genre, double price, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.isAvailable = available;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    // Override equals and hashCode for proper grouping and comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
    
}