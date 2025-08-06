//Calculate Average Of N Numbers

import java.util.Scanner;

public class pq29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            sum = sum + number;
        }
        double avg = sum / n;
        System.out.println("Average " + avg);
        input.close();
    }
}
