import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            EBook ebook = new EBook();

            // Input ISBN
            System.out.print("Enter ISBN: ");
            ebook.ISBN = scanner.nextLine();

            // Input Title
            System.out.print("Enter Title: ");
            ebook.title = scanner.nextLine();

            // Input Author Name
            System.out.print("Enter Author Name: ");
            String author = scanner.nextLine();
            ebook.setAuthor(author);

            // Display Details
            ebook.displayDetails();

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

/*
Input:
Enter ISBN: 1234567890
Enter Title: Java Programming
Enter Author Name: prakul

Output:
ISBN: 1234567890
Title: Java Programming
Author: prakul
*/
