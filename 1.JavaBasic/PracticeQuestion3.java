// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal amount, time , rate");
        double principalAmount = input.nextDouble();
        double time = input.nextDouble();
        double rateOfinterst = input.nextDouble();
        double simpleInterst = (principalAmount * time * rateOfinterst) / 100;
        System.out.println("simple interst " + simpleInterst);
        input.close();

    }
}
