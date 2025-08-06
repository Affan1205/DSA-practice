//hcf of two number

import java.util.Scanner;

public class pq45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number ");
        int num2 = input.nextInt();
        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        int hcf = 1;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        input.close();
    }
}
