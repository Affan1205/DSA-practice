//Write a program to print the factorial of a number by defining a method named 'Factorial'

import java.util.Scanner;

public class pq9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numm = in.nextInt();
        int factorial = fact(numm);
        System.out.println("Factorial of " + numm + " is: " + factorial);

        // NCr
        int n1 = in.nextInt();
        int r1 = in.nextInt();
        int num = fact(n1);
        System.out.println(num);
        int deno = fact(r1) * fact(n1 - r1);
        System.out.println(deno);
        float NCr = num / deno;
        System.out.println(NCr);
        in.close();
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int facti = 1;
        for (int i = 1; i <= n; i++) {
            facti *= i;
        }
        return facti;
    }

}
