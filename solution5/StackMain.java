package solution5;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackExample s = new StackExample();
        int choice;

        do {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int num = sc.nextInt();
                    s.pushElement(num);
                    break;

                case 2:
                    s.popElement();
                    break;

                case 3:
                    s.checkEmpty();
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
