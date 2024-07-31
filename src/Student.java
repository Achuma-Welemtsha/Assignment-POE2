import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String email;
    private String course;

    // List to hold students
    private static List<Student> studentList = new ArrayList<>();

    // Constructor
    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getter and Setter methods
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    // Save a new student
    public static void saveStudent(String id, String name, int age, String email, String course) {
        Student student = new Student(id, name, age, email, course);
        studentList.add(student);
        System.out.println("Student details have been successfully saved.");
    }

    // Search for a student
    public static Student searchStudent(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Delete a student
    public static boolean deleteStudent(String id) {
        Student student = searchStudent(id);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    // Display student report
    public static void studentReport() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : studentList) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + 
                                   ", Age: " + student.getAge() + ", Email: " + student.getEmail() + 
                                   ", Course: " + student.getCourse());
            }
        }
    }

    // Exit application
    public static void exitStudentApplication() {
        System.out.println("Exiting application.");
        System.exit(0);
    }

    // Input validation for age
    public static int getValidAge() {
        Scanner scanner = new Scanner(System.in);
        int age;
        while (true) {
            try {
                System.out.print("Enter age (16 or older): ");
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("Age must be 16 or older.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for age.");
            }
        }
        return age;
    }
}
