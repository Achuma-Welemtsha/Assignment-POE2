/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achum
 */
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Capture New Student");
            System.out.println("2. Search for Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View Student Report");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    captureNewStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    Student.studentReport();
                    break;
                case 5:
                    Student.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }
    }

    private static void captureNewStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int age = Student.getValidAge();

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        Student.saveStudent(id, name, age, email, course);
    }

    private static void searchStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();

        Student student = Student.searchStudent(id);
        if (student != null) {
            System.out.println("Student found: ID: " + student.getId() + ", Name: " + student.getName() + 
                               ", Age: " + student.getAge() + ", Email: " + student.getEmail() + 
                               ", Course: " + student.getCourse());
        } else {
            System.out.println("Student with ID " + id + " cannot be located.");
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();

        boolean isDeleted = Student.deleteStudent(id);
        if (isDeleted) {
            System.out.println("Student with ID " + id + " has been deleted.");
        } else {
            System.out.println("Student with ID " + id + " cannot be located.");
        }
    }
}
