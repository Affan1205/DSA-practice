//Take integer inputs till the user enters 0 and print the sum of all numbers 

import java.util.Scanner;

public class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.print("sum of all inputs number are: " + sum);
        input.close();
    }
}
