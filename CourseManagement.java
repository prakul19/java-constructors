import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter course name:");
            String courseName = scanner.nextLine();
            System.out.println("Enter course duration (weeks):");
            int duration = scanner.nextInt();
            System.out.println("Enter course fee:");
            double fee = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter institute name:");
            String instituteName = scanner.nextLine();

            // Update institute name for all courses
            CourseManagement.updateInstituteName(instituteName);

            // Creating Course object
            CourseManagement course = new CourseManagement(courseName, duration, fee);

            // Display course details
            System.out.println("\nCourse details:");
            course.displayCourseDetails();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName;

    // Parameterized constructor to initialize course details
    public CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

/*
Input:
Enter course name: Advanced Java
Enter course duration (weeks): 12
Enter course fee: 12000.0
Enter institute name: chitkara University

Output:
Course details:
Course Name: Advanced Java
Duration: 12 weeks
Fee: 12000.0
Institute Name: chitkara University
*/
