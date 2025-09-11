//Calculate Average Of N Numbers

import java.util.Scanner;

public class PracticeQuestion7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter total numbers");
        int n = in.nextInt();
        System.out.print("value the numbers : ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum += num;

        }
        float avg = sum / n;
        System.out.println("Average of " + n + "number is : " + avg);
in.close();
    }
}
