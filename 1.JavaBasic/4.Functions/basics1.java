import java.util.Scanner;

public class basics1 {

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1 number");
        int num1 = input.nextInt();
        System.out.println("Enter the 2 number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
        input.close();
    }

    public static void main(String[] args) {
        // Example 1 - Sum of Two Numbers
        sum();// calling the function
    }
}
