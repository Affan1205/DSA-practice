//fibonacii series

import java.util.Scanner;

public class pq21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Till how many number : ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i <= num; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
in.close();
    }
}
