//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class jbpq3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal amount , time , rate of interst: ");
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();
        double simpleInterst = (principal * time * rate) / 100;
        System.out.println("simple interset = " + simpleInterst);

        input.close();


    }
}
