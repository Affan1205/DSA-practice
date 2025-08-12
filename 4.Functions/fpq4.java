//Take in two numbers and an operator (+, -, *, /) and calculate the value

import java.util.Scanner;

public class fpq4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        calculation(num1, num2);
        input.close();
    }

    static void calculation(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.print("input the operator: ");
        char ch = in.next().charAt(0);
        if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("INvalid Input.");
        }
        in.close();
    }
}
