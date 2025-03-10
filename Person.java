import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter name for Person 1:");
            String name1 = scanner.nextLine();
            System.out.println("Enter age for Person 1:");
            int age1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter address for Person 1:");
            String address1 = scanner.nextLine();

            // Creating Person object using parameterized constructor
            Person person1 = new Person(name1, age1, address1);

            // Creating Person object using copy constructor
            Person person2 = new Person(person1);

            // Displaying person details
            System.out.println("\nPerson 1 details:");
            person1.display();
            System.out.println("\nPerson 2 details:");
            person2.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

/*
Input:
Enter name for Person 1: Prakul
Enter age for Person 1: 20
Enter address for Person 1: Lucknow

Output:
Person 1 details:
Name: Prakul
Age: 20
Address: Lucknow

Person 2 details:
Name: Alice
Age: 28
Address: 456 Park Ave
*/
