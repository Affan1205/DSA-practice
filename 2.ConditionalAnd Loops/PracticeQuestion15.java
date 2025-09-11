//PERFECT NUMBER

import java.util.Scanner;

public class PracticeQuestion15 {
    public static void main(String[] args) {
        System.out.println("Ennter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (temp == sum) {
            System.out.println(temp + " is a Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }
        input.close();
    }
}
