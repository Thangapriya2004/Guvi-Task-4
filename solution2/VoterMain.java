package solution2;

import java.util.Scanner;

public class VoterMain {
    static void main() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter solution2.Voter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();

            Voter v = new Voter(id,name,age);
            System.out.println("\n solution2.Voter Registered Successfully!");
            v.display();

        }catch (InvalidVoterAgeException e) {
            System.out.println(" Error: " + e.getMessage());
        }finally {
            sc.close();
        }
    }
}
