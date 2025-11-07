package solution4;

import java.util.Scanner;

public class StudentGradeMain { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentGrades sg = new StudentGrades();
    int choice;

    do {
        // Menu for user
        System.out.println("\n===== Student Grade System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Display Student Grade");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // clear input buffer

        switch (choice) {
            case 1:
                System.out.print("Enter Student Name: ");
                String nameAdd = sc.nextLine();
                System.out.print("Enter Grade: ");
                int grade = sc.nextInt();
                sg.addStudent(nameAdd, grade);
                break;

            case 2:
                System.out.print("Enter Student Name to Remove: ");
                String nameRemove = sc.nextLine();
                sg.removeStudent(nameRemove);
                break;

            case 3:
                System.out.print("Enter Student Name to Display: ");
                String nameDisplay = sc.nextLine();
                sg.displayGrade(nameDisplay);
                break;

            case 4:
                System.out.println(" Exiting... Goodbye!");
                break;

            default:
                System.out.println(" Invalid choice! Try again.");
        }

    } while (choice != 4);

    sc.close();
}
}
