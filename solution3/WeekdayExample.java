package solution3;

import java.util.Scanner;

public class WeekdayExample {
    static void main() {

        String[] days = { "Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter day index (0 for Sunday, 6 for Saturday): ");
            int index = sc.nextInt();

            System.out.println("Day is: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Invalid day index! Please enter a number between 0 and 6.");

        }
        finally {
            sc.close();
        }
    }
}
