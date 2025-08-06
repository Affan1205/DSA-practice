//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class pq24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int sum = 0;
        while (true) {
            int num = input.nextInt();
            if (num != 0) {
                
                sum += num;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
        input.close();
    }
}
