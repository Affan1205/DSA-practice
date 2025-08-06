//Perfect Number In Java

import java.util.Scanner;

public class pq48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number: ");
        int num = sc.nextInt();
        int ans = 0;
        int check = num;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                ans += i;
            }
        }
        if (ans == check) {
            System.out.println(ans + " is a perfect number.");
        } else {
            System.out.println(ans + " is not a perfect number.");
        }
        sc.close();
    }
}
