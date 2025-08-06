import java.util.Scanner;

public class basic2 {

    public static void main(String[] args) {
        // Example 2 - return the sum value
        int ans = sum();
        System.out.println("The sum is " + ans);

    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1 number");
        int num1 = input.nextInt();
        System.out.println("Enter the 2 number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
        
    }
  
}
