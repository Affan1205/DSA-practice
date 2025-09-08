//To find Armstrong Number between two given number.

import java.util.Scanner;

public class jbpq9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the inputs = ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Armstrong numbers between " + num1 + " and " + num2 + " are: ");

        for (int i = num1; i < num2; i++) {
            int temp = i;
            int count = 0;
            // count Digit
            int t = temp;
            while (t > 0) {
                t = t / 10;
                count++;
            }

            // calculating armstrong number
            t = temp;
            int ans = 0;
            while (t > 0) {
                int digit = t % 10;
                ans = ans + (int) Math.pow(digit, count);
                t = t / 10;

            }
            //checking armstrong
            if (ans == i)
                System.out.print(i + " ");
        }
    }
}
