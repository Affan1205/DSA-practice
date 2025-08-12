//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class fpq5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        largest(num1, num2);
        input.close();
    }

    static void largest(int a, int b) {
        if (a > b) {
            System.out.println(a + " is largest.");

        } else {
            System.out.println(b + " is largest .");
        }
    }
}
