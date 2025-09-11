// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class jbpq5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.print(num1 + " is greater.");

        } else {
            System.out.print(num2 + " is greater.");
        }
        input.close();
    }

}
