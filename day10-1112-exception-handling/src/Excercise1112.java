import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Excercise1112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Book> books = createBookList();
	        List<Patron> patrons = createPatronList(books);
	        
	     // Example usage of LibraryAnalytics methods
	        System.out.println("Books grouped by genre:");
	        System.out.println(Excercise1112.groupBooksByGenre(books));

	        System.out.println("\nBooks partitioned by availability:");
	        System.out.println(Excercise1112.partitionBooksByAvailability(books));

	        System.out.println("\nCount of books by genre:");
	        System.out.println(Excercise1112.countBooksByGenre(books));

	        System.out.println("\nAuthors grouped by genre:");
	        System.out.println(Excercise1112.listAuthorsByGenre(books));

	        System.out.println("\nJoined book titles:");
	        System.out.println(Excercise1112.joinBookTitles(books));

	        System.out.println("\nMost expensive book by genre:");
	        System.out.println(Excercise1112.findMostExpensiveBookInEachGenre(books));

	        System.out.println("\nLeast expensive book by genre:");
	        System.out.println(Excercise1112.findLeastExpensiveBookInEachGenre(books));

	        System.out.println("\nBook ISBN to Title Map:");
	        System.out.println(Excercise1112.convertToIsbnTitleMap(books));

	        System.out.println("\nPatrons grouped by city:");
	        System.out.println(Excercise1112.groupPatronsByCity(patrons));

	        System.out.println("\nMost borrowed book by each patron:");
	        System.out.println(Excercise1112.findMostBorrowedBookByEachPatron(patrons));


	}
	
	public static List<Book> createBookList() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("ISBN001", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 12.99, true));
        books.add(new Book("ISBN002", "1984", "George Orwell", "Dystopian", 15.99, true));
        books.add(new Book("ISBN003", "To Kill a Mockingbird", "Harper Lee", "Fiction", 10.99, false));
        books.add(new Book("ISBN004", "The Catcher in the Rye", "J.D. Salinger", "Fiction", 9.99, true));
        books.add(new Book("ISBN005", "Brave New World", "Aldous Huxley", "Dystopian", 14.99, false));
        books.add(new Book("ISBN006", "Pride and Prejudice", "Jane Austen", "Romance", 8.99, true));
        books.add(new Book("ISBN007", "The Hobbit", "J.R.R. Tolkien", "Fantasy", 17.99, true));
        books.add(new Book("ISBN008", "War and Peace", "Leo Tolstoy", "Historical", 20.99, false));
        books.add(new Book("ISBN009", "The Odyssey", "Homer", "Classics", 11.99, true));
        books.add(new Book("ISBN010", "Moby Dick", "Herman Melville", "Adventure", 16.99, true));

        return books;
    }

    public static List<Patron> createPatronList(List<Book> books) {
        List<Patron> patrons = new ArrayList<>();

        Patron p1 = new Patron("Alice", "New York");
        p1.borrowBook(books.get(0));
        p1.borrowBook(books.get(1));

        Patron p2 = new Patron("Bob", "Los Angeles");
        p2.borrowBook(books.get(2));
        p2.borrowBook(books.get(3));

        Patron p3 = new Patron("Carol", "Chicago");
        p3.borrowBook(books.get(4));
        p3.borrowBook(books.get(5));

        Patron p4 = new Patron("David", "New York");
        p4.borrowBook(books.get(6));
        p4.borrowBook(books.get(7));

        Patron p5 = new Patron("Eve", "San Francisco");
        p5.borrowBook(books.get(8));
        p5.borrowBook(books.get(9));

        patrons.add(p1);
        patrons.add(p2);
        patrons.add(p3);
        patrons.add(p4);
        patrons.add(p5);

        return patrons;
    }


	
	// Task 1: Group Books by Genre
    // Groups all books in the library by genre and returns a map where each genre maps to a list of books in that genre.
    public static Map<String, List<Book>> groupBooksByGenre(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre));
    }

    // Task 2: Partition Books by Availability
    // Partitions books into two categories: available and not available. The result is a Map<Boolean, List<Book>>.
    public static Map<Boolean, List<Book>> partitionBooksByAvailability(List<Book> books) {
        return books.stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
    }

    // Task 3: Count Books by Genre
    // Counts the number of books in each genre. Returns a map with genre names as keys and counts as values.
    public static Map<String, Long> countBooksByGenre(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
    }

    // Task 4: List Authors by Genre
    // Groups authors by genre, ensuring each author appears only once per genre.
    public static Map<String, Set<String>> listAuthorsByGenre(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.mapping(Book::getAuthor, Collectors.toSet())));
    }

    // Task 5: Join All Book Titles in a Single String
    // Concatenates all book titles into a single string, separated by commas.
    public static String joinBookTitles(List<Book> books) {
        return books.stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
    }

    // Task 6: Find the Most Expensive Book in Each Genre
    // Finds the most expensive book in each genre and returns a map where each genre maps to the highest-priced book.
    public static Map<String, Optional<Book>> findMostExpensiveBookInEachGenre(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.maxBy(Comparator.comparing(Book::getPrice))));
    }

    // Task 7: Find the Least Expensive Book in Each Genre
    // Finds the least expensive book in each genre and returns a map where each genre maps to the lowest-priced book.
    public static Map<String, Optional<Book>> findLeastExpensiveBookInEachGenre(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.minBy(Comparator.comparing(Book::getPrice))));
    }

    // Task 8: Convert List of Books to a Map of ISBN to Title
    // Converts the list of books to a map where the ISBN is the key and the title is the value.
    public static Map<String, String> convertToIsbnTitleMap(List<Book> books) {
        return books.stream()
                .collect(Collectors.toMap(Book::getIsbn, Book::getTitle));
    }

    // Task 9: Group Patrons by City
    // Groups patrons by their city and returns a map where each city maps to a list of patrons residing there.
    public static Map<String, List<Patron>> groupPatronsByCity(List<Patron> patrons) {
        return patrons.stream()
                .collect(Collectors.groupingBy(Patron::getCity));
    }

    // Task 10: Find Most Borrowed Book by Each Patron
    // For each patron, finds their most borrowed book based on the highest frequency in their borrowedBooks list.
    public static Map<String, Optional<Book>> findMostBorrowedBookByEachPatron(List<Patron> patrons) {
        return patrons.stream().collect(Collectors.toMap(
                Patron::getName,
                patron -> patron.getBorrowedBooks().stream()
                        .collect(Collectors.groupingBy(book -> book, Collectors.counting()))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
        ));
    }
}

