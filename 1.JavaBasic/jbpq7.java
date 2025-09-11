//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class jbpq7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term of fibonacci series: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b; // To go forward we are first update a and then b.
            b = sum;
        }
        System.out.println();
        System.out.print("Fibonacci Series up to " + n + " numbers = " + sum);
        input.close();
    }
}
