//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class fpq3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int principal = input.nextInt();
        System.out.print("Enter the time : ");
        float time = input.nextFloat();
        System.out.print("Enter the rate of intrest: ");
        float rate = input.nextFloat();

        float SI = simpleIntrest(principal, time, rate);
        System.out.println("Simple interst = " + SI);
        input.close();
    }

    static float simpleIntrest(int p, float t, float r) {

        float amount = (p * t * r) / 100;
        return amount;
    }

}
