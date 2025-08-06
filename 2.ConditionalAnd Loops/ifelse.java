import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        // 2.if-else statement - Provides an alternative block if the condition is
        // false.
        // if (condition) {
        // // executed if true
        // } else {
        // // executed if false
        // }

        // Example-Suppose you want to print whether a number is positive or not:
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0) {
        System.out.println("Number is not positive");
        } else {
        System.out.println("Number is positive");
        }

        /*
         * 3. if-else if-else ladder - Handles multiple conditions in sequence.
         * if (condition1) {
         * // code if condition1 is true
         * } else if (condition2) {
         * // code if condition2 is true
         * } else {
         * // code if all above are false
         * }
         */

        // Example- Suppose you want to assign grades based on marks:
        Scanner in = new Scanner(System.in);
        int grades = in.nextInt();
        if (grades >= 90) {
            System.out.println("A");
        } else if (grades >= 75) {
            System.out.println("B+");
        } else if (grades >= 65) {
            System.out.println("B");
        } else if (grades >= 50) {
            System.out.println("C");
        } else if (grades >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail ! but can do if never give up.");
        }

        
        input.close();
        in.close();
    }
}
