// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class PracticeQuestion7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input nth term : ");
        int n = input.nextInt();
        int a = 0, b = 1;
        int sum = 0;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.print(" " + sum);

            a = b;// to move forward we assign b to a first
            b = sum;
        }
        input.close();
    }
}
