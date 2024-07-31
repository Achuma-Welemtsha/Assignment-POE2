/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementapp;

/**
 *ST104479552
 * @author Achuma
 */
import java.util.Scanner;
public class StudentManagementApp {



    public static void main(String[] args) {
        welcomeMessage();
        getUserInput();
    }

    public static void welcomeMessage() {
        System.out.println("*****************");
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*****************");
        System.out.println("Enter (1) to launch menu or press any button to exit.");
    }

    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            menu();
        } else {
            System.out.println("Exiting application. Goodbye!");
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("Please select one of the following menu items:");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("(1)  Capture new Student.");
        System.out.println("(2)  Search for a student.  ");
        System.out.println("(3)  Delete a student. ");
        System.out.println("(4)  Print student Report. ");
        System.out.println("(5)  Exit Application. ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
  
 
    
    

