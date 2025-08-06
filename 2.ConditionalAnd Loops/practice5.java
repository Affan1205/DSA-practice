//Calculator Program

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the operator: ");
            char op = input.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the two number : ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (op == '+') {
                    int sum = a + b;
                    System.out.println(sum);
                }
                if (op == '-') {
                    int sub = a - b;
                    System.out.println(sub);
                }
                if (op == '*') {
                    int mul = a * b;
                    System.out.println(mul);
                }
                if (op == '/') {
                    int div = a / b;
                    System.out.println(div);
                }
                if (op == '%') {
                    int mod = a % b;
                    System.out.println(mod);
                } else if (op == 'x') {
                    break;
                }
            }

            else {
                System.out.println("Invalid input");
            }

        }
        input.close();
    }
}
