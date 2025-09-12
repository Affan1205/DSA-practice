//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class PracticeQuestion4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Select an operation (+,-,*,/)");
        char operation = input.next().charAt(0);
        if (operation == '+') {
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
        } else if (operation == '-') {
            int difference = num1 - num2;
            System.out.println("difference = " + difference);
        } else if (operation == '*') {
            int multi = num1 * num2;
            System.out.println("multiplication = " + multi);

        } else if (operation == '/') {
            if (num2 != 0) {
                int div = num1 / num2;
                System.out.println("division = " + div);
            } else {
                System.out.println("number can't divide by 0 !! Try Again.");
            }

        } else {
            System.out.println("Invalid Input!!!");
        }
        input.close();
    }

}
