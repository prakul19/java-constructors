import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the radius of the circle:");
            double radius = scanner.nextDouble();

            // Creating Circle objects
            Circle userCircle = new Circle(radius); // Using parameterized constructor
            Circle defaultCircle = new Circle(); // Using default constructor

            // Displaying radius and area of circles
            System.out.println("Default Circle: ");
            System.out.println("Radius: " + defaultCircle.getRadius());
            System.out.println("Area: " + defaultCircle.calculateArea());

            System.out.println("\nUser Circle: ");
            System.out.println("Radius: " + userCircle.getRadius());
            System.out.println("Area: " + userCircle.calculateArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius set to 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/*
Input:
Enter the radius of the circle: 5.0

Output:
Default Circle:
Radius: 1.0
Area: 3.141592653589793

User Circle:
Radius: 5.0
Area: 78.53981633974483
*/
