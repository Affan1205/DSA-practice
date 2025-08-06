//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class pq2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer.");
        int n = input.nextInt();
        evenOdd(n);
        input.close();
    }

    static void evenOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
