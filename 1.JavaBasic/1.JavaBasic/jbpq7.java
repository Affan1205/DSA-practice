//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class jbpq7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum=0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;  // To go forward we are first update a and then b.
            b = sum;
        }
        System.out.print("Fibonacci Series up to " + n + " numbers = " + sum );
        input.close();
    }
}
