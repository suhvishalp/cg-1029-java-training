import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int age;
    private String city;
    private List<Book> borrowedBooks;

    public Patron(String name, String city) {
        this.name = name;
        this.city = city;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to add borrowed books for each patron
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
}