//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class pq5 {
    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the inputs: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int mul = product(num1, num2);
        System.out.println("product of " + num1 + " and " + num2 + " is : " + mul);
        in.close();
    }
}
