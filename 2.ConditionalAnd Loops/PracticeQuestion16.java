// Check Leap Year Or Not

import java.util.Scanner;

public class PracticeQuestion16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ennter the number");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println("Not a leap year.");
        }
        input.close();
    }
}
