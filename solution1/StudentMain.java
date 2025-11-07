package solution1;

import java.util.Scanner;

public class StudentMain {
    static void main() {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Age; ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Course: ");
            String course = sc.nextLine();

            Student s = new Student(rollNo, name,age, course);
            System.out.println("\n solution1.Student Created Successfully!");
            s.display();
        } catch (AgeNotwithinRangeException e) {
            System.out.println(" Error:" + e.getMessage());

        }
        catch (NameNotValidException e ) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            sc.close();
        }
    }
}
