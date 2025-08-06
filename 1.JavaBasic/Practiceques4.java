//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Practiceques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        System.out.print("Enter the operation ");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            float add = num1 + num2;
            System.out.println("sum of " + num1 + " and " + num2 + " is " + add);
        } else if (operator == '-') {
            float sub = num1 - num2;
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
        } else if (operator == '*') {
            float mul = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mul);
        } else if (operator == '/') {
            float div = num1 / num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + div);
        } else {
            System.out.println("Invalid Input! Try Again");
        }
        input.close();

    }
}
