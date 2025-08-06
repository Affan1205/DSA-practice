// Write a program to print the sum of negative numbers, sum of positive even numbers and 
// the sum of positive odd numbers from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class pq52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum_neg = 0;
        int pos_even = 0;
        int pos_odd = 0;
        while (true) {
            int n = input.nextInt();
            if (n != 0) {
                if (n < 0) {
                    sum_neg = sum_neg + n;
                } else if (n % 2 == 0) {
                    pos_even += n;
                } else if (n % 2 != 0) {
                    pos_odd += n;
                }
            } else {
                break;
            }
        }
        System.out.println("Sum of negative number " + sum_neg);
        System.out.println("Sum of positive even number " + pos_even);
        System.out.println("Sum of positive odd number " + pos_odd);
        input.close();
    }
}
