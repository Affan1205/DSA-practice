//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class pq014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = add(num);
        System.out.println("The sum of first " + num + " natural numbers is : " + sum);
    }

    static int add(int n) {
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ += i;
        }
        return summ;
    }
}
