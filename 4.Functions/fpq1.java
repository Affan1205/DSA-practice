// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class fpq1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        evenOdd(num);
        in.close();
    }

    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " even number.");

        } else {
            System.out.println(n + " odd number.");
        }
    }
}
