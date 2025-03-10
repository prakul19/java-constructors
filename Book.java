import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter title for Book 1:");
            String title1 = scanner.nextLine();
            System.out.println("Enter author for Book 1:");
            String author1 = scanner.nextLine();
            System.out.println("Enter price for Book 1:");
            double price1 = scanner.nextDouble();
            scanner.nextLine();

            // Creating Book object using parameterized constructor
            Book book1 = new Book(title1, author1, price1);

            System.out.println("Enter title for Book 2:");
            String title2 = scanner.nextLine();
            System.out.println("Enter author for Book 2:");
            String author2 = scanner.nextLine();
            System.out.println("Enter price for Book 2:");
            double price2 = scanner.nextDouble();

            // Creating Book object using parameterized constructor
            Book book2 = new Book(title2, author2, price2);

            // Display book details
            System.out.println("\nBook 1 details:");
            book1.display();
            System.out.println("\nBook 2 details:");
            book2.display();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price < 0) {
            throw new Exception("Price cannot be negative");
        }
        this.price = price;
    }

    // Display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

/*
Input:
Enter title for Book 1: Java Basics
Enter author for Book 1: James
Enter price for Book 1: 399.99
Enter title for Book 2: Advanced Java
Enter author for Book 2: James 2
Enter price for Book 2: 599.99

Output:
Book 1 details:
Title: Java Basics
Author: James
Price: 399.99

Book 2 details:
Title: Advanced Java
Author: James 2
Price: 599.99

*/
