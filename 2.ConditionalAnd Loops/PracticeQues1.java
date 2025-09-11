// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class PracticeQues1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int Product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            Product = Product * digit;
            num = num / 10;
        }
        int ans = Product - sum;
        System.out.println("Product = " + Product + " and Sum= " + sum);
        System.out.print("Subtract the Product and Sum of Digits of an Integer: " + ans);
        input.close();
    }
}
