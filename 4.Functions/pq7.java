//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class pq7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        isPrime(num);
        in.close();
    }

    static void isPrime(int n) {
        boolean isBoolean = true;
        if (n == 1) {
            System.out.println("Neither Prime nor composite.");

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isBoolean = false;
                break;

            }
        }
        if (isBoolean) {
            System.out.println(n + " Prime Number.");
        } else {
            System.out.println(n + " Not a Prime Number.");
        }
    }
}


