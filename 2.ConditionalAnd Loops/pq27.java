//Factorial Program In Java

import java.util.Scanner;

public class pq27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                fact = 1;
                break;
            }
            fact = fact * i;

        }

        System.out.println("Factorial of " + n + " is : " + fact);
        input.close();
    }
}
