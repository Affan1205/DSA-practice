//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a
// list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class PracticeQuestion17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvensum = 0;
        int positiveOddsum = 0;
        while (true) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                negativeSum += n;
            } else if (n > 0) {
                if (n % 2 == 0)
                    positiveEvensum += n;
                else
                    positiveOddsum += n;

            }

            System.out.println("sum of odd negative number: " + negativeSum);
            System.out.println("sum of odd even number: " + positiveOddsum);
            System.out.println("sum of positive even number: " + positiveEvensum);
        }
        input.close();
    }
}