import java.util.Scanner;

public class StudentCgpa {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            PostgraduateStudent pgStudent = new PostgraduateStudent();

            // Input Roll Number
            System.out.print("Enter Roll Number: ");
            pgStudent.rollNumber = scanner.nextInt();
            scanner.nextLine();

            // Input Name
            System.out.print("Enter Name: ");
            pgStudent.name = scanner.nextLine();

            // Input CGPA
            System.out.print("Enter CGPA: ");
            float CGPA = scanner.nextFloat();
            pgStudent.setCGPA(CGPA);

            // Display Details
            pgStudent.displayDetails();

            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private float CGPA;

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }
}

class PostgraduateStudent extends Student {
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

/*
Input:
Enter Roll Number: 1033
Enter Name: Prakul
Enter CGPA: 8.7

Output:
Roll Number: 1033
Name: Prakul
CGPA: 8.7
*/
