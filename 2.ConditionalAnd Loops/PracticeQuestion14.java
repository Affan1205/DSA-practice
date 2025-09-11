//LCM
import java.util.Scanner;

public class PracticeQuestion14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        int hcfValue = Integer.MIN_VALUE;
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                if (i > hcfValue) {
                    hcfValue = i;
                }
            }
        }
        System.out.println("Hcf of " + num1 + " and " + num2 + " is: " + hcfValue);
        int lcm = (num1 * num2) / hcfValue;
        System.out.println("Lcm of " + num1 + " and " + num2 + " is: " + lcm);
        input.close();
    }
}
