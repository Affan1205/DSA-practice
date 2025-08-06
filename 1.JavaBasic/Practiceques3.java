//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Practiceques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the input .");
        int principal_amt = input.nextInt();
        float time = input.nextFloat();
        float rate_of_interst = input.nextFloat();
        double Simple_interst = (principal_amt * time * rate_of_interst) / 100;
        System.out.println("Simple Interst = " + Simple_interst);
        input.close();
    }
}
