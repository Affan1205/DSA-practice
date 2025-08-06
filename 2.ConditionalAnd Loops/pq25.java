//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class pq25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println("enter the number: ");
        while (true) {
            int num = input.nextInt();
            if (num != 0) {
                if (num>max) {
                    max = num;
                }
            } else {
                break;
            }
        }
        System.out.println(max);
        input.close();
    }
}
