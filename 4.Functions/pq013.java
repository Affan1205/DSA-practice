//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class pq013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        isPrime(num1, num2);
        input.close();
    }

    static void isPrime(int a, int b) {
        for (int i = a; i < b; i++) {
            if (checkingPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean checkingPrime(int a) {
        boolean isBoolean = true;
        if (a == 1) {
            System.out.println("niether prime nor composite.");
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isBoolean = false;
                break;
            }
        }
        if (isBoolean == true) {
            return true;
        } else {
            return false;
        }
    }
}
