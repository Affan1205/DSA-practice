//Calculate CGPA Java Program

import java.util.Scanner;

public class pq36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current semester: ");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double sem_cgpa = input.nextDouble();
            sum = sum + sem_cgpa;
        }
        double cgpa = sum / n;
        System.out.println("cgpa is: " + cgpa);
        input.close();
    }
}
