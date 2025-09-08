//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class jbpq3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int principalAmount = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();
        double simpleIntrest = (principalAmount * time * rate) / 100;
        System.out.print("Simple Intrest = " + simpleIntrest);


        
        input.close();

    }
}
