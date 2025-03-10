import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter customer name:");
            String customerName = scanner.nextLine();
            System.out.println("Enter car model:");
            String carModel = scanner.nextLine();
            System.out.println("Enter rental days:");
            int rentalDays = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Creating CarRental object
            CarRental rental = new CarRental(customerName, carModel, rentalDays);

            // Display rental details
            System.out.println("\nRental details:");
            rental.display();

            // Calculate and display total cost
            double totalCost = rental.calculateTotalCost();
            System.out.println("Total cost: " + totalCost);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double costPerDay = 500.0;

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
    }
}

/*
Input:
User input required:
Enter customer name: Prakul
Enter car model: Range Rover
Enter rental days: 5

Output:
Rental details:
Customer Name: Prakul
Car Model: Range Rover
Rental Days: 5
Total cost: 2500.0
*/
