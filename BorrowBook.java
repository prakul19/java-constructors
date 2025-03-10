import java.util.Scanner;

public class BorrowBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter book title:");
            String title = scanner.nextLine();
            System.out.println("Enter book author:");
            String author = scanner.nextLine();
            System.out.println("Enter book price:");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Is the book available? (true/false):");
            boolean availability = scanner.nextBoolean();

            BorrowBook book = new BorrowBook(title, author, price, availability);

            // Display book details
            System.out.println("\nBook details before borrowing:");
            book.display();

            book.borrowBook();

            // Display book details after borrowing:
            System.out.println("\nBook details after borrowing:");
            book.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor
    public BorrowBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized constructor
    public BorrowBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Copy constructor
    public BorrowBook(BorrowBook other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }
}

/*
Input:
Enter book title: Manifestation
Enter book author: Roxie Nafousi
Enter book price: 299.99
Is the book available? (true/false): true

Output:
Book details before borrowing:
Title: Manifestation
Author: Roxie Nafousi
Price: 299.99
Available: Yes

You have borrowed the book: Manifestation

Book details after borrowing:
Title: Manifestation
Author: Roxie Nafousi
Price: 299.99
Available: No
*/
