import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter guest name:");
            String guestName = scanner.nextLine();
            System.out.println("Enter room type:");
            String roomType = scanner.nextLine();
            System.out.println("Enter number of nights:");
            int nights = scanner.nextInt();

            // Creating HotelBooking objects
            HotelBooking booking1 = new HotelBooking(); // Default constructor
            HotelBooking booking2 = new HotelBooking(guestName, roomType, nights); // Parameterized constructor
            HotelBooking booking3 = new HotelBooking(booking2); // Copy constructor

            // Display booking details
            System.out.println("\nBooking 1 details:");
            booking1.display();
            System.out.println("\nBooking 2 details:");
            booking2.display();
            System.out.println("\nBooking 3 details:");
            booking3.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display booking details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

/*
Input:
User input required:
Enter guest name: Prakul
Enter room type: Deluxe
Enter number of nights: 3

Output:
Booking 1 details:
Guest Name: Unknown
Room Type: Standard
Nights: 1

Booking 2 details:
Guest Name: Prakul
Room Type: Deluxe
Nights: 3

Booking 3 details:
Guest Name: Prakul
Room Type: Deluxe
Nights: 3
*/
