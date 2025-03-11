import java.util.Scanner;

public class EmployeeRecords {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Manager manager = new Manager();

            // Input Employee ID
            System.out.print("Enter Employee ID: ");
            manager.employeeID = scanner.nextInt();
            scanner.nextLine();

            // Input Department
            System.out.print("Enter Department: ");
            manager.department = scanner.nextLine();

            // Input Salary
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            manager.setSalary(salary);

            // Display Employee Details
            manager.displayDetails();

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Must be non-negative.");
        }
    }
}

class Manager extends Employee {
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

/*
Input:
Enter Employee ID: 1033
Enter Department: HR
Enter Salary: 50000

Output:
Employee ID: 1033
Department: HR
Salary: 50000
*/
