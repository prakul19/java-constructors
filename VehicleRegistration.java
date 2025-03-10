import java.util.Scanner;

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter owner name:");
            String ownerName = scanner.nextLine();
            System.out.println("Enter vehicle type:");
            String vehicleType = scanner.nextLine();
            System.out.println("Enter new registration fee:");
            double newFee = scanner.nextDouble();
            scanner.nextLine();

            // Update registration fee for all vehicles
            VehicleRegistration.updateRegistrationFee(newFee);

            // Creating Vehicle object
            VehicleRegistration vehicle = new VehicleRegistration(ownerName, vehicleType);

            // Display vehicle details
            System.out.println("\nVehicle details:");
            vehicle.displayVehicleDetails();

            // Display updated registration fee
            System.out.println("\nUpdated Registration Fee: " + VehicleRegistration.registrationFee);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;

    // Parameterized constructor to initialize vehicle details
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

/*
Input:
User input required:
Enter owner name: prakul
Enter vehicle type: Car
Enter new registration fee: 150.0

Output:
Vehicle details:
Owner Name: prakul
Vehicle Type: Car
Registration Fee: 150.0

Updated Registration Fee: 150.0
*/
