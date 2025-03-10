import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter product name:");
            String productName = scanner.nextLine();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();

            // Creating product object
            Product product = new Product(productName, price);

            // Display product details
            System.out.println("\nProduct details:");
            product.displayProductDetails();

            // Display total products
            Product.displayTotalProducts();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String productName;
    private double price;
    private static int totalProducts = 0;

    // Parameterized constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

/*
Input:
Enter product name: Laptop
Enter product price: 1500.0

Output:
Product details:
Product Name: Laptop
Price: 1500.0

Total Products: 1
*/
