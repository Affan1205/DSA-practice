//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class jbpq4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.println("Select an opertion(+ , - ,*,/) ");
        char ch = input.next().charAt(0);
        if (ch == '+') {
            float sum = num1 + num2;
            System.out.println(sum);
        } else if (ch == '-') {
            float diff = num1 - num2;
            System.out.println(diff);
        } else if (ch == '*') {
            float multi = num1 * num2;
            System.out.println(multi);
        } else if (ch == '/') {
            float div = num1 / num2;
            System.out.println(div);
        } else {
            System.out.println("Invalid Input !! Try Again :)");
        }

        input.close();

        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // char ch = input.next().charAt(0);
        // if (ch == '+') {
        // int sum = num1 + num2;
        // System.out.print("Sum of two number: " + sum);
        // } else if (ch == '-') {

        // int sub = num1 - num2;
        // System.out.print("subtraction of two number: " + sub);
        // } else if (ch == '*') {
        // int mul = num1 * num2;
        // System.out.print("multiplication of two number " + mul);
        // } else if (ch == '/') {
        // int div = num1 / num2;
        // System.out.print("division of two number " + div);
        // } else {
        // System.out.print("INvalid input.");
        // }
    }
}