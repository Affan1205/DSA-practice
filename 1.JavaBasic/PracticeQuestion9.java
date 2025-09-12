// To find Armstrong Number between two given number.

import java.util.Scanner;

public class PracticeQuestion9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input 1 : ");
        int num1 = input.nextInt();
        System.out.println("enter the input 2 : ");
        int num2 = input.nextInt();
        System.out.print("Armstrong number b/w " + num1 + " and " + num2 + " = ");
        for (int i = num1; i < num2; i++) {
            int temp = i;
            int count = 0;
            // count digit
            int t = temp;
            while (t > 0) {
                t = t / 10;
                count++;
            }
            // calculating Armstrong Numbers
            t = temp;
            int ans = 0;
            while (t > 0) {
                int digit = t % 10;
                ans = ans + (int) Math.pow(digit, count);
                t = t / 10;
            }
            // checkingArmstrong
            if (ans == i) {
                System.out.print(i + " ");
            }

        }
        input.close();

    }
}
